package org.jewelknife.jblog.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public @ResponseBody
    String handleBlogException(BlogException ex) {
		return "Handled BlogException";
	}

}
