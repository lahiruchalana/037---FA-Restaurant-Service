package com.example.restaurant_service.dto;

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
    private Date createdDate;
    private Date updatedDate;

}
