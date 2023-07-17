package com.vijeism.crud.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
@Document(collection = "employees")
public class Employee {

    @Id
    private String employee_id;
    private String name;
    private int age;
    private Long salary;
    @DBRef
    private List<Vehicle> vehicleList;

}


