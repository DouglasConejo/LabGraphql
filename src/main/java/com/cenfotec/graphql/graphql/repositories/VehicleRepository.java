package com.cenfotec.graphql.graphql.repositories;

import com.cenfotec.graphql.graphql.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository  extends JpaRepository<Vehicle, Integer> {

}
