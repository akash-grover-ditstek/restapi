package com.demo.restapi.service;

import com.demo.restapi.model.Student;
import org.springframework.stereotype.Service;
import java.util.List;

import java.io.Serializable;

@Service
public interface StudentService extends Serializable {

    List<Student> getAllStudent();

    Student saveStudent(Student student);

    Student updateStudent(int id);
}
