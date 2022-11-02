package com.demo.restapi.service.impl;

import com.demo.restapi.model.Department;
import com.demo.restapi.repo.DepartmentRepo;
import com.demo.restapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public List<Department> getAllDepartment() {
        return departmentRepo.findAll();
    }

    public Department saveDepartment(Department department){
        return departmentRepo.save(department);
    }

}
