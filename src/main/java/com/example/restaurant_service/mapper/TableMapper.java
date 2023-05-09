package com.example.restaurant_service.mapper;

import com.example.restaurant_service.dto.TableDTO;
import com.example.restaurant_service.table.Table;

public class TableMapper {

    public static TableDTO mapEntityToDto(Table table) {
        TableDTO tableDto = new TableDTO();
        tableDto.setId(table.getId());
        tableDto.setName(table.getName());
        tableDto.setAvgMaxPrice(table.getAvgMaxPrice());
        tableDto.setAvgMinPrice(table.getAvgMinPrice());
        tableDto.setRestaurant(table.getRestaurant());
        tableDto.setNumberOfChairs(table.getNumberOfChairs());
        tableDto.setView(table.getView());
        tableDto.setImageSet(table.getImageSet());
        tableDto.setCreatedDate(table.getCreatedDate());
        tableDto.setUpdatedDate(table.getUpdatedDate());
        return tableDto;
    }

    public static Table mapDTOToEntity(TableDTO tableDto) {
        Table table = new Table();
        table.setId(tableDto.getId());
        table.setName(tableDto.getName());
        table.setAvgMaxPrice(tableDto.getAvgMaxPrice());
        table.setAvgMinPrice(tableDto.getAvgMinPrice());
        table.setRestaurant(tableDto.getRestaurant());
        table.setNumberOfChairs(tableDto.getNumberOfChairs());
        table.setView(tableDto.getView());
        table.setImageSet(tableDto.getImageSet());
        table.setCreatedDate(tableDto.getCreatedDate());
        table.setUpdatedDate(tableDto.getUpdatedDate());
        return table;
    }
}
