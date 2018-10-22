package com.spring.repossitory;

import com.spring.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends  CrudRepository<Student, Integer> {

}
