package org.jewelknife.jblog.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen_yingbo on 11/13/14.
 */
@Controller
@RequestMapping("/login/*")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void getLogin() {
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "home";
    }

}
