package com.example.restaurant_service.mapper;

import com.example.restaurant_service.dto.MenuTypeDTO;
import com.example.restaurant_service.menutype.MenuType;

public class MenuTypeMapper {

    public static MenuType mapDTOToEntity(MenuTypeDTO dto) {
        MenuType entity = new MenuType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setItemSet(dto.getItemSet());
        entity.setRestaurant(dto.getRestaurant());
        entity.setPriority(dto.getPriority());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setUpdatedDate(dto.getUpdatedDate());
        return entity;
    }

    public static MenuTypeDTO mapEntityToDto(MenuType entity) {
        MenuTypeDTO dto = new MenuTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setItemSet(entity.getItemSet());
        dto.setRestaurant(entity.getRestaurant());
        dto.setPriority(entity.getPriority());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setUpdatedDate(entity.getUpdatedDate());
        return dto;
    }

}
