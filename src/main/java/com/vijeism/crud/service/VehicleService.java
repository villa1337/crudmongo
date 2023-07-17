package com.vijeism.crud.service;

import com.vijeism.crud.model.Employee;
import com.vijeism.crud.model.Vehicle;
import com.vijeism.crud.repository.EmployeeRepository;
import com.vijeism.crud.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Vehicle> listAll(){
        return vehicleRepository.findAll();
    }

    public Vehicle addVehicle(Vehicle vehicle) {

        Employee employee = employeeRepository.findById(vehicle.getEmployee_id()).orElse(null);
        if (employee == null) {
            throw new RuntimeException("Employee does not exist");
        }

        // Save the vehicle and get the id
        Vehicle vehicle1 = vehicleRepository.save(vehicle);


        // Add the vehicle to the employee's vehicle list.
        List<Vehicle> vehicleList = employee.getVehicleList() == null ? new ArrayList<>() : employee.getVehicleList();
        vehicleList.add(vehicle1);

        employee.setVehicleList(vehicleList);
        // Save the employee document to the database.
        employeeRepository.save(employee);
        return vehicle1;
    }
}
