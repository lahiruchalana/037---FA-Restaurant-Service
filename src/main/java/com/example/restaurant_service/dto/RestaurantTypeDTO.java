package com.example.restaurant_service.dto;

import com.example.restaurant_service.restaurant.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantTypeDTO {

    private Long id;
    private String name;
    private Set<Restaurant> restaurantSet = new HashSet<>();
    private Date createdDate;
    private Date updatedDate;

}
