package com.vijeism.crud.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@ToString
@Document(collection = "vehicles")
public class Vehicle {

    @Id
    private String vehicle_id;
    private String make;
    private String employee_id;

}
