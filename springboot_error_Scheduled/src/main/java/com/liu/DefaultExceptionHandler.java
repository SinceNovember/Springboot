package com.liu;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 用于处理错误界面问题
 */
@ControllerAdvice
public class DefaultExceptionHandler {
    public static String ERROR_VIEW="error";//错误后访问的界面
    @ExceptionHandler
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e)
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("Exception",e);
        modelAndView.addObject("url",request.getRequestURI());
        modelAndView.setViewName(ERROR_VIEW);
        return modelAndView;
    }
}
