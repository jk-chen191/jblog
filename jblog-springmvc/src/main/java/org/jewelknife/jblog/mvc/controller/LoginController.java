package org.jewelknife.jblog.mvc.controller;

import org.jewelknife.jblog.jpa.User;
import org.jewelknife.jblog.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String login(User userform, Model model) {
        User user = userRepository.findByUsername(userform.getUsername());

        if (user == null) {
            model.addAttribute("errorMsg", "User is not existst !");
            return null;
        }

        user = userRepository.findByUsernameAndPassword(userform.getUsername(), userform.getPassword());

        if (user == null) {
            model.addAttribute("errorMsg", "Password is not correctly !");
            return null;
        }

        return "redirect:/home";
    }

}
