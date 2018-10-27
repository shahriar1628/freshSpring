package com.spring.entity;

import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(name = "NAME")
    String name;

    @Column(name = "AGE" )
    int age;

    public Student(){
        super();
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void  setName(String name) {
        this.name = name ;
    }
    public int getAge() {
        return age ;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
