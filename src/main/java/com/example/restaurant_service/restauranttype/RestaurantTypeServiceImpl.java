package com.example.restaurant_service.restauranttype;

import com.example.restaurant_service.dto.RestaurantDTO;
import com.example.restaurant_service.dto.RestaurantTypeDTO;
import com.example.restaurant_service.exceptions.CustomException;
import com.example.restaurant_service.mapper.RestaurantMapper;
import com.example.restaurant_service.mapper.RestaurantTypeMapper;
import com.example.restaurant_service.restaurant.Restaurant;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class RestaurantTypeServiceImpl implements RestaurantTypeService {

    private final RestaurantTypeRepository restaurantTypeRepository;

    @Override
    public RestaurantTypeDTO addOrUpdateRestaurantType(RestaurantTypeDTO restaurantTypeDTO) {
        log.info ("LOG :: RestaurantTypeServiceImpl addOrUpdateRestaurantType()");
        RestaurantTypeDTO restaurantTypeDTOSaved;
        try {
            log.info ("LOG :: RestaurantTypeServiceImpl addOrUpdateRestaurantType() inside try");
            RestaurantType restaurantType = RestaurantTypeMapper.mapDTOToEntity(restaurantTypeDTO);
            RestaurantType restaurantTypeSaved = restaurantTypeRepository.save(restaurantType);
            restaurantTypeDTOSaved = RestaurantTypeMapper.mapEntityToDto(restaurantTypeSaved);
        } catch (Exception e) {
            log.info ("LOG :: RestaurantTypeServiceImpl addOrUpdateRestaurantType() inside catch");
            throw new CustomException("An error occurred while handling the exception: " + e.getMessage());
        }
        return restaurantTypeDTOSaved;
    }

}
