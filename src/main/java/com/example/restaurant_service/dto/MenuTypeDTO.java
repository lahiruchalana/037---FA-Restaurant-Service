package com.example.restaurant_service.dto;

import com.example.restaurant_service.restaurant.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuTypeDTO {

    private Long id;
    private String name;
    private String itemSet;
    private Restaurant restaurant;
    private Integer priority;
    private Date createdDate;
    private Date updatedDate;

}
