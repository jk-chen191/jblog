package org.jewelknife.jblog.mvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen_yingbo on 11/11/14.
 */
@Controller
public class SimpleController {

    @RequestMapping("/sayhello")
    public @ResponseBody String sayHello(@RequestParam String name) {
        return "Hello World!" + name;
    }

}
