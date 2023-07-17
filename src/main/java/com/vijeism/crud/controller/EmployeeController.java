package com.vijeism.crud.controller;

import com.vijeism.crud.service.EmployeeService;
import com.vijeism.crud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){
        return employeeService.listAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(Employee employee){
        return new ResponseEntity(employeeService.addEmployee(employee), HttpStatus.OK);
    }
}
