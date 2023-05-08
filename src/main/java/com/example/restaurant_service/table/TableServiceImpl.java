package com.example.restaurant_service.table;

import com.example.restaurant_service.dto.RestaurantTypeDTO;
import com.example.restaurant_service.dto.TableDTO;
import com.example.restaurant_service.exceptions.CustomException;
import com.example.restaurant_service.mapper.RestaurantTypeMapper;
import com.example.restaurant_service.mapper.TableMapper;
import com.example.restaurant_service.restauranttype.RestaurantType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class TableServiceImpl implements TableService {

    private final TableRepository tableRepository;

    @Override
    public TableDTO addOrUpdateTable(TableDTO tableDTO) {
        log.info ("LOG :: TableServiceImpl addOrUpdateTable()");
        TableDTO tableDTOSaved;
        try {
            log.info ("LOG :: TableServiceImpl addOrUpdateTable() inside try");
            Table table = TableMapper.mapDTOToEntity(tableDTO);
            Table tableSaved = tableRepository.save(table);
            tableDTOSaved = TableMapper.mapEntityToDto(tableSaved);
        } catch (Exception e) {
            log.info ("LOG :: TableServiceImpl addOrUpdateTable() inside catch");
            throw new CustomException("An error occurred while handling the exception: " + e.getMessage());
        }
        return tableDTOSaved;
    }

}
