package com.spring.controller;

import com.spring.bin.Vehicle;
import com.spring.config.DispatcherConfig;
import com.spring.entity.Student;
import com.spring.repossitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.server.Dispatcher;

@Controller
public class HelloWorldController {

    @Autowired
    private Vehicle vh;

    @Autowired
    StudentRepository studentRepository;
    @RequestMapping("/helloworld")
    public ModelAndView hello() {
        System.out.println("enter controller");
        vh.run();
        Student student = new Student("shahriar",12);
        studentRepository.save(student);


        String helloWorldMessage = "Hello world";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
    @ModelAttribute
    public Student getStudent(@RequestParam String name, @RequestParam int age ){
        return new Student(name,age);
    }
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public ModelAndView addingStudent(@ModelAttribute Student student){
        System.out.println("allahum magfirli");
        studentRepository.save(student);
        return new ModelAndView("hello", "message", "helloWorldMessage");
    }
}