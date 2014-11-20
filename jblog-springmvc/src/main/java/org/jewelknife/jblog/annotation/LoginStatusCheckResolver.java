package org.jewelknife.jblog.annotation;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class LoginStatusCheckResolver implements HandlerMethodArgumentResolver {

	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getParameterAnnotation(LoginStatusCheck.class) != null;
	}

	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
			WebDataBinderFactory binderFactory) throws Exception {
        LoginStatusCheck attr = parameter.getParameterAnnotation(LoginStatusCheck.class);
		if(webRequest.getAttribute("loginUser", WebRequest.SCOPE_SESSION) == null) {
        }
        return null;
	}
	
}
