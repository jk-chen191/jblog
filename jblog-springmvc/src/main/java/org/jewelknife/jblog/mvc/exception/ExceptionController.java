package org.jewelknife.jblog.mvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {

	@RequestMapping("/exception")
	public @ResponseBody
    String exception() {
		throw new IllegalStateException("Sorry!");
	}

	@RequestMapping("/global-exception")
	public @ResponseBody
    String blogException() throws BlogException {
		throw new BlogException();
	}

	@ExceptionHandler
	public @ResponseBody
    String handle(IllegalStateException e) {
		return "IllegalStateException handled!";
	}

}
