package com.spring.controller;

import com.spring.bin.Vehicle;
import com.spring.entity.Student;
import com.spring.repossitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@ComponentScan(basePackages = {"com.spring"})
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

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String submit(@ModelAttribute("student") Student student ,
                         BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        studentRepository.save(student);
        System.out.println(student.getAge());
        System.out.println(student.getName());
       return "student" ;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudentModule(Model model) {
         model.addAttribute("student",new Student());
         return "student" ;
        }

}