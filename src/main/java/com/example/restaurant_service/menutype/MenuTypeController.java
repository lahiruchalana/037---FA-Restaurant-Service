package com.example.restaurant_service.menutype;

import com.example.restaurant_service.dto.MenuTypeDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/menu-type")
@RequiredArgsConstructor
@Slf4j
public class MenuTypeController {

    private final MenuTypeService menuTypeService;

    @PostMapping("/add-or-update")
    public ResponseEntity<MenuTypeDTO> addOrUpdateMenuType(
            @RequestBody MenuTypeDTO menuTypeDTO
    ) {
        log.info ("LOG :: MenuTypeController addOrUpdateMenuType()");
        return new ResponseEntity<>(menuTypeService.addOrUpdateMenuType(menuTypeDTO), HttpStatus.OK);
    }

}
