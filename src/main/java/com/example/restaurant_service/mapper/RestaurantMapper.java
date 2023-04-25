package com.example.restaurant_service.mapper;

import com.example.restaurant_service.dto.RestaurantDTO;
import com.example.restaurant_service.restaurant.Restaurant;

public class RestaurantMapper {

    public static Restaurant mapDTOToEntity(RestaurantDTO dto) {
        Restaurant entity = new Restaurant();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setOwnerName(dto.getOwnerName());
        entity.setRestaurantTypeSet(dto.getRestaurantTypeSet());
        entity.setNumberOne(dto.getNumberOne());
        entity.setNumberTwo(dto.getNumberTwo());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setUpdatedDate(dto.getUpdatedDate());
        return entity;

    }

    public static RestaurantDTO mapEntityToDto(Restaurant entity) {
        RestaurantDTO dto = new RestaurantDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setOwnerName(entity.getOwnerName());
        dto.setRestaurantTypeSet(entity.getRestaurantTypeSet());
        dto.setNumberOne(entity.getNumberOne());
        dto.setNumberTwo(entity.getNumberTwo());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setUpdatedDate(entity.getUpdatedDate());
        return dto;
    }
}
