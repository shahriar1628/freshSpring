package com.spring.controller;

import com.spring.bin.Vehicle;
import com.spring.config.DispatcherConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.server.Dispatcher;

@Controller
public class HelloWorldController {

    @Autowired
    private Vehicle vh;
    @RequestMapping("/helloworld")
    public ModelAndView hello() {
        System.out.println("enter controller");
        vh.run();

        String helloWorldMessage = "Hello world";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}