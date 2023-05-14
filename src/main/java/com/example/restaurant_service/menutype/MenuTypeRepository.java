package com.example.restaurant_service.menutype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuTypeRepository extends JpaRepository<MenuType, Long> {
}
