package com.demo.restapi.service;

import com.demo.restapi.model.Department;
import com.demo.restapi.model.Student;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.*;
@Service
public interface DepartmentService extends Serializable {

    List<Department> getAllDepartment();

    Department saveDepartment(Department department);
}
