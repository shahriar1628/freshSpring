package com.spring.entity;

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

}
