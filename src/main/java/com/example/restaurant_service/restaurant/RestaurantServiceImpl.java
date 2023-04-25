package com.example.restaurant_service.restaurant;

import com.example.restaurant_service.dto.RestaurantDTO;
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
    public RestaurantDTO addOrUpdateRestaurant(RestaurantDTO restaurantDTO) {        log.info ("LOG :: RestaurantController addOrUpdateRestaurant()");
        log.info ("LOG :: RestaurantController addOrUpdateRestaurant()");
        try {
            log.info ("LOG :: RestaurantController addOrUpdateRestaurant()");
        } catch (Exception e) {

        }
        return null;
    }
}
