//package com.demo.restapi.controller;
//
//
//import com.demo.restapi.model.Student;
//import com.demo.restapi.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping("/")
//    public List<Student> getAllData(){
//
//        return studentService.getAllStudent();
//    }
//
//    @PostMapping("/student")
//    public Student saveStudentData(@RequestBody Student student) {
//        System.out.println(student);
//        return studentService.saveStudent(student);
//    }
//
//    @PutMapping("updateStudent/{id}")
//    public Student updateStudent(@PathVariable("id") Integer id , @RequestBody Student student){
//        Student studentData  = studentService.updateStudent(id);
//        Student newStudent = new Student();
//        newStudent.setId(studentData.getId());
//        newStudent.setAge(student.getAge());
//        newStudent.setName(student.getName());
//        newStudent.setMobile(student.getMobile());
//
//        return studentService.saveStudent(newStudent);
//    }
//}