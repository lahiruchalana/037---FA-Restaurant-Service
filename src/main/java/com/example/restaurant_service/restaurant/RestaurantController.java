package com.example.restaurant_service.restaurant;

import com.example.restaurant_service.dto.RestaurantDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/restaurant")
@RequiredArgsConstructor
@Slf4j
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("/add-or-update")
    public ResponseEntity<RestaurantDTO> addOrUpdateRestaurant(
            @RequestBody RestaurantDTO restaurantDTO
    ) {
        log.info ("LOG :: RestaurantController addOrUpdateRestaurant()");
        return new ResponseEntity<>(restaurantService.addOrUpdateRestaurant(restaurantDTO), HttpStatus.OK);
    }

}
