package com.api_restaurant.api_rest.repositories;

import com.api_restaurant.api_rest.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<ClientModel,Long> {
}
