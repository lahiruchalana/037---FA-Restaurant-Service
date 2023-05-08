package com.example.restaurant_service.restauranttype;

import com.example.restaurant_service.dto.RestaurantDTO;
import com.example.restaurant_service.dto.RestaurantTypeDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/restaurant-type")
@RequiredArgsConstructor
@Slf4j
public class RestaurantTypeController {

    private final RestaurantTypeService restaurantTypeService;

    @PostMapping("/add-or-update")
    public ResponseEntity<RestaurantTypeDTO> addOrUpdateRestaurantType(
            @RequestBody RestaurantTypeDTO restaurantTypeDTO
    ) {
        log.info ("LOG :: RestaurantTypeController addOrUpdateRestaurantType()");
        return new ResponseEntity<>(restaurantTypeService.addOrUpdateRestaurantType(restaurantTypeDTO), HttpStatus.OK);
    }

}
