package com.example.restaurant_service.restauranttype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantTypeRepository extends JpaRepository<RestaurantType, Long> {

}
