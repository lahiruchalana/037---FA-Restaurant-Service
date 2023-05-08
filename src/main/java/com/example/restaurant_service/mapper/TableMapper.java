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
        return tableDto;
    }

    public static Table mapDTOToEntity(TableDTO tableDto) {
        Table table = new Table();
        table.setId(tableDto.getId());
        table.setName(tableDto.getName());
        table.setAvgMaxPrice(tableDto.getAvgMaxPrice());
        table.setAvgMinPrice(tableDto.getAvgMinPrice());
        return table;
    }
}
