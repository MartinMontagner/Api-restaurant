package com.api_restaurant.api_rest.repositories;

import com.api_restaurant.api_rest.models.WaiterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWaiterRepository extends JpaRepository<WaiterModel,Long> {
}
