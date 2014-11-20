package org.jewelknife.jblog.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jewelknife on 2014/11/15.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "redirect:/blog/list";
    }

}
