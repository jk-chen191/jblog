package org.jewelknife.jblog.mvc.controller;

import org.apache.commons.lang3.StringUtils;
import org.jewelknife.jblog.annotation.LoginStatusCheck;
import org.jewelknife.jblog.jpa.Blog;
import org.jewelknife.jblog.jpa.BlogRepository;
import org.jewelknife.jblog.jpa.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by chen_yingbo on 11/19/14.
 */
@Controller
@RequestMapping("/blog/*")
public class BlogController {

    private final int PAGE_LIMIT = 10;

    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping(value="/list", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Page<Blog> listWithJson(@RequestParam(defaultValue = "0", required = false) String page, @RequestParam(defaultValue = "0", required = false) Long user_id) {
        return this.getPageBean(page, user_id);
    }

    @RequestMapping(value="/list", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Page<Blog> listWithXML(@RequestParam(defaultValue = "0", required = false) String page, @RequestParam(defaultValue = "0", required = false) Long user_id) {
        return this.getPageBean(page, user_id);
    }

    @RequestMapping(value="/list", produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView list(@RequestParam(defaultValue = "0", required = false) String page, @RequestParam(defaultValue = "0", required = false) Long user_id) {
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.getModel().put("pageBean", this.getPageBean(page, user_id));
        return modelAndView;
    }

    @RequestMapping(value="/page/{id}")
    public ModelAndView showOne(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/blog/blog_page_item");
        modelAndView.getModel().put("blog", blogRepository.findOne(id));
        return modelAndView;
    }

    @RequestMapping(value="/author/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Page<Blog> listByAuthorWithJson(@PathVariable Long id, @RequestParam(defaultValue = "0", required = false) String page) {
        return this.getPageBean(page, id);
    }

    @RequestMapping(value="/author/{id}")
    public ModelAndView listByAuthor(@PathVariable Long id, @RequestParam(defaultValue = "0", required = false) String page) {
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.getModel().put("pageBean", this.getPageBean(page, id));
        return modelAndView;
    }

    @LoginStatusCheck
    @RequestMapping(value="/create", method = RequestMethod.GET)
    public void getCreatePage() {
    }

    @LoginStatusCheck
    @RequestMapping(value="/create", method = RequestMethod.POST)
    public String create(Blog form, Model model, HttpSession session) {
        Blog blog = null;
        try {
            form.setCreatedBy(((User)session.getAttribute("loginUser")).getId());
            blog = blogRepository.save(form);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (blog == null) {
            model.addAttribute("errorMsg", "Save blog fail !");
            model.addAttribute("failBean", form);
            return null;
        }
        return "redirect:/blog/page/" + blog.getId();
    }

    private Page<Blog> getPageBean(String page, long user_id) {
        int pageInt = 0;
        if (StringUtils.isNumeric(page) && Integer.parseInt(page) > 0) {
            pageInt = Integer.parseInt(page) - 1;
        }
        Pageable pageRequest = new PageRequest(pageInt, PAGE_LIMIT, Sort.Direction.DESC, "id");
        Page<Blog> pageBean;
        if (user_id > 0) {
            pageBean = blogRepository.findByCreatedBy(user_id, pageRequest);
        } else {
            pageBean = blogRepository.findAll(pageRequest);
        }
        return pageBean;
    }
}
