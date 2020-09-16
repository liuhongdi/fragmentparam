package com.fragmentparam.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class WebInterceptor extends HandlerInterceptorAdapter {
    //如果view不为空，把登录信息传递给模板
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        if (modelAndView != null) {
            ModelMap modelMap = modelAndView.getModelMap();

            modelMap.addAttribute("GlobalTitle","商品管理系统");
        }
    }
}
