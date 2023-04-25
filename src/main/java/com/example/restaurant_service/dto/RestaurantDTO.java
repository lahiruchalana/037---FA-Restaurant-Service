package com.example.restaurant_service.dto;

import com.example.restaurant_service.configuration.customAnnotations.NotEmptyOrNull;
import com.example.restaurant_service.restauranttype.RestaurantType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {

    private Long id;
    @NotEmptyOrNull(message = "Name Must Not Be Empty")
    private String name;
    @NotEmptyOrNull(message = "OwnerName Must Not Be Empty")
    private String ownerName;
    @NotEmptyOrNull(message = "RestaurantTypeSet Must Not Be Empty")
    private Set<RestaurantType> restaurantTypeSet = new HashSet<>();
    private Integer numberOne;
    private Integer numberTwo;
    private Date createdDate;
    private Date updatedDate;

}
