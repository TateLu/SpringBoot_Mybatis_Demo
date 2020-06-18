package com.demo.controller;

import com.demo.entity.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: cookie
 * @Date: 2018/7/26 15:09
 * @Description: 全局捕获异常和自定义全局捕获异常
 */

@ControllerAdvice  //不指定包默认加了@Controller和@RestController都能控制
public class GlobalExceptionHandler {

/**
     * 拦截捕捉自定义异常 MyException.class
     * @param myex
     * @return
     */

/*
    @ResponseBody
    @ExceptionHandler(value = RuntimeException.class)
    public Object myExceptionHandler(HttpServletRequest request, HttpServletResponse response, RuntimeException myex){

        Map<String,Object> map  = new HashMap<String,Object>();

        map.put("message",myex.getMessage());


        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
        return map;



    }
*/



}
