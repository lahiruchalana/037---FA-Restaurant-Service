package com.example.restaurant_service.table;

import com.example.restaurant_service.dto.RestaurantTypeDTO;
import com.example.restaurant_service.dto.TableDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/table")
@RequiredArgsConstructor
@Slf4j
public class TableController {

    private final TableService tableService;

    @PostMapping("/add-or-update")
    public ResponseEntity<TableDTO> addOrUpdateTable(
            @RequestBody TableDTO tableDTO
    ) {
        log.info ("LOG :: TableController addOrUpdateTable()");
        return new ResponseEntity<>(tableService.addOrUpdateTable(tableDTO), HttpStatus.OK);
    }

}
