package com.vijeism.crud.service;

import com.vijeism.crud.model.Employee;
import com.vijeism.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> listAll(){
        return employeeRepository.findAll();
    }

    public Employee getEmployee(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public ResponseEntity<Employee> addEmployee(Employee employee) {
        return new ResponseEntity(employeeRepository.save(employee), HttpStatus.OK);
    }
}
