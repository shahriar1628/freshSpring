package com.spring.controller;

import com.spring.entity.Student;
import com.spring.repossitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentapi")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/students", method = RequestMethod.GET,headers = "Accept=application/json")
    public Iterable<Student> getStudents(){
       return studentRepository.findAll();
    }
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET,headers = "Accept=application/json")
    public Student getStudent(@PathVariable int id){
        return studentRepository.findOne(id);
    }
    @RequestMapping(value = "/students", method = RequestMethod.POST,headers = "Accept=application/json")
    public Student addStudent(@RequestBody Student  student){
        return studentRepository.save(student);
    }
    @RequestMapping(value = "/students", method = RequestMethod.PUT,headers = "Accept=application/json")
    public Student updateStudent(@RequestBody Student  student){
        return studentRepository.save(student);
    }
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE,headers = "Accept=application/json")
    public void deleteStudent(@PathVariable int id){
         studentRepository.delete(id);
    }
}
