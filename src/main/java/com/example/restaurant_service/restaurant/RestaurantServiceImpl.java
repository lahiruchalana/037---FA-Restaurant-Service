package com.example.restaurant_service.restaurant;

import com.example.restaurant_service.dto.RestaurantDTO;
import com.example.restaurant_service.exceptions.CustomException;
import com.example.restaurant_service.mapper.RestaurantMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService{

    private final RestaurantRepository restaurantRepository;

    @Override
    public RestaurantDTO addOrUpdateRestaurant(RestaurantDTO restaurantDTO) {
        log.info ("LOG :: RestaurantServiceImpl addOrUpdateRestaurant()");
        RestaurantDTO restaurantDTOSaved;
        try {
            log.info ("LOG :: RestaurantServiceImpl addOrUpdateRestaurant() inside try");
            Restaurant restaurant = RestaurantMapper.mapDTOToEntity(restaurantDTO);
            Restaurant restaurantSaved = restaurantRepository.save(restaurant);
            restaurantDTOSaved = RestaurantMapper.mapEntityToDto(restaurantSaved);
        } catch (Exception e) {
            log.info ("LOG :: RestaurantServiceImpl addOrUpdateRestaurant() inside catch");
            throw new CustomException("An error occurred while handling the exception: " + e.getMessage());
        }
        return restaurantDTOSaved;
    }
}
