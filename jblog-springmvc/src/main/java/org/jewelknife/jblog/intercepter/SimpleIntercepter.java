package org.jewelknife.jblog.intercepter;

import org.jewelknife.jblog.annotation.LoginStatusCheck;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by chen_yingbo on 11/20/14.
 */
public class SimpleIntercepter extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            LoginStatusCheck loginStatusCheck = ((HandlerMethod) handler).getMethodAnnotation(LoginStatusCheck.class);

            //没有声明需要权限,或者声明不验证权限
            if (loginStatusCheck == null || loginStatusCheck.needCheck() == false)
                return true;
            else {
                //在这里实现自己的权限验证逻辑
                HttpSession session = request.getSession();
                if (session.getAttribute("loginUser") != null)//如果验证成功返回true（这里直接写false来模拟验证失败的处理）
                    return true;
                else{
                    //返回到登录界面
                    response.sendRedirect(request.getContextPath() + "/login/login");
                    return false;
                }
            }
        } else {
            return true;
        }

    }
}
