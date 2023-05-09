package com.example.restaurant_service.dto;

import com.example.restaurant_service.restaurant.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableDTO {

    private Long id;
    private String name;
    private Float avgMaxPrice;
    private Float avgMinPrice;
    private Restaurant restaurant;
    private Integer numberOfChairs;
    private String view;
    private String imageSet;
    private Date createdDate;
    private Date updatedDate;

}
