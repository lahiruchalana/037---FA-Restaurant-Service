package com.example.restaurant_service.menutype;

import com.example.restaurant_service.dto.MenuTypeDTO;
import com.example.restaurant_service.exceptions.CustomException;
import com.example.restaurant_service.mapper.MenuTypeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class MenuTypeServiceImpl implements MenuTypeService {

    private final MenuTypeRepository menuTypeRepository;

    @Override
    public MenuTypeDTO addOrUpdateMenuType(MenuTypeDTO menuTypeDTO) {
        log.info ("LOG :: MenuTypeServiceImpl addOrUpdateMenuType()");
        MenuTypeDTO menuTypeDTOSaved;
        try {
            log.info ("LOG :: MenuTypeServiceImpl addOrUpdateMenuType() inside try");
            MenuType menuType = MenuTypeMapper.mapDTOToEntity(menuTypeDTO);
            MenuType menuTypeSaved = menuTypeRepository.save(menuType);
            menuTypeDTOSaved = MenuTypeMapper.mapEntityToDto(menuTypeSaved);
        } catch (Exception e) {
            log.info ("LOG :: MenuTypeServiceImpl addOrUpdateMenuType() inside catch");
            throw new CustomException("An error occurred while handling the exception: " + e.getMessage());
        }
        return menuTypeDTOSaved;
    }
}
