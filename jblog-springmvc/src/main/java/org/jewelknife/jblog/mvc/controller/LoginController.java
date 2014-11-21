package org.jewelknife.jblog.mvc.controller;

import org.jewelknife.common.utils.MD5Util;
import org.jewelknife.jblog.jpa.User;
import org.jewelknife.jblog.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by chen_yingbo on 11/13/14.
 */
@Controller
@RequestMapping("/login/*")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void getLogin() {
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User userform, Model model, HttpSession session) {
        User user = userRepository.findByUsername(userform.getUsername());
        if (user == null) {
            model.addAttribute("errorMsg", "User is not existst !");
            return null;
        }
        user = userRepository.findByUsernameAndPassword(userform.getUsername(), MD5Util.MD5(userform.getPassword()));
        if (user == null) {
            model.addAttribute("errorMsg", "Password is not correctly !");
            return null;
        }
        session.setAttribute("loginUser", user);
        return "redirect:/home";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.setAttribute("loginUser", null);
        return "redirect:/home";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(User userform, Model model) {
        User user = userRepository.findByUsername(userform.getUsername());
        if (user != null) {
            model.addAttribute("errorMsg", "User is aready existst !");
            return "/login/login";
        }
        userform.setPassword(MD5Util.MD5(userform.getPassword()));
        user = userRepository.save(userform);
        if (user == null) {
            model.addAttribute("errorMsg", "Reg fail !");
            return "/login/login";
        }
        return "redirect:/login/login";
    }

}
