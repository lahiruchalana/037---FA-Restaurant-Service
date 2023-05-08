package com.example.restaurant_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableDTO {

    private Long id;
    private String name;
    private Float avgMaxPrice;
    private Float avgMinPrice;

}
