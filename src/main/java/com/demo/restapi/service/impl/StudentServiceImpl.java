package com.demo.restapi.service.impl;

import com.demo.restapi.model.Student;
import com.demo.restapi.repo.StudentRepo;
import com.demo.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(int id) {
        Student student = studentRepo.findById(id);

        return student;
    }


}
