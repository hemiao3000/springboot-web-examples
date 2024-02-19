package com.example.web.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterceptor implements HandlerInterceptor {

    /**
     * 该方法会在 Controller 方法前执行
     * 返回值表示是否继续后续操作：
     * 返回 true 时，表示继续向下执行；
     * 返回 false 时，会中断后续所有操作<small>（包括调用下一个拦截器和 Controller 中的方法执行）</small>。
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return true;
    }

    /**
     * 在 Controller 方法调用之后，且解析视图之前执行。
     * 可以通过此方法对模型和视图做出进一步修改。
     * postHandle 要先于 afterCompletion 执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    /**
     * 该方法会在整个请求完成（即，视图渲染结束）之后执行。
     * 可以通过此方法实现一些资源清理、记录日志信息等工作。
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
