package com.vijeism.crud.repository;

import com.vijeism.crud.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle,String> {

}
