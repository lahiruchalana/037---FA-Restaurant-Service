package com.example.restaurant_service.mapper;

import com.example.restaurant_service.dto.RestaurantTypeDTO;
import com.example.restaurant_service.restauranttype.RestaurantType;

public class RestaurantTypeMapper {

    public static RestaurantType mapDTOToEntity(RestaurantTypeDTO dto) {
        RestaurantType entity = new RestaurantType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setRestaurantSet(dto.getRestaurantSet());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setUpdatedDate(dto.getUpdatedDate());
        return entity;
    }

    public static RestaurantTypeDTO mapEntityToDto(RestaurantType entity) {
        RestaurantTypeDTO dto = new RestaurantTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setRestaurantSet(entity.getRestaurantSet());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setUpdatedDate(entity.getUpdatedDate());
        return dto;
    }


}
