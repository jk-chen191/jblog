package org.jewelknife.jblog.mvc.controller;

import org.apache.commons.lang3.StringUtils;
import org.jewelknife.jblog.jpa.Blog;
import org.jewelknife.jblog.jpa.BlogRepository;
import org.jewelknife.jblog.jpa.User;
import org.jewelknife.jblog.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by chen_yingbo on 11/19/14.
 */
@Controller
@RequestMapping("/blog/*")
public class BlogController {

    private final int PAGE_LIMIT = 10;

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/list")
    @ResponseBody
    public Page<Blog> list() {
        Pageable page = new PageRequest(0, PAGE_LIMIT, Sort.Direction.DESC, "id");
        return blogRepository.findAll(page);
    }

    @RequestMapping(value="/page/{id}")
    public ModelAndView showOne(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/blog/blog_page_item");
        modelAndView.getModel().put("blog", blogRepository.findOne(id));
        return modelAndView;
    }

    @RequestMapping(value="/author/{name}")
    @ResponseBody
    public Page<Blog> list(@PathVariable String name, @RequestParam(defaultValue = "0", required = false) String page) {
        int pageInt = 0;
        if (StringUtils.isNumeric(page) && Integer.parseInt(page) > 0) {
            pageInt = Integer.parseInt(page) - 1;
        }
        Pageable pageRequest = new PageRequest(pageInt, PAGE_LIMIT);
        User user = userRepository.findByUsername(name);
        if (user == null) {
            return new PageImpl<Blog>(new ArrayList<Blog>(), pageRequest, 0);
        }
        return blogRepository.findByCreatedBy(user.getId(), pageRequest);
    }

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public void getCreatePage() {
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public String create(Blog form, Model model, HttpSession session) {
        Blog blog = null;
        try {
            form.setCreatedBy(((User)session.getAttribute("loginUser")).getId());
            blog = blogRepository.save(form);
        } catch (Exception e) {
        }
        if (blog == null) {
            model.addAttribute("errorMsg", "Save blog fail !");
            model.addAttribute("failBean", form);
            return null;
        }
        return "redirect:/blog/page/" + blog.getId();
    }
}
