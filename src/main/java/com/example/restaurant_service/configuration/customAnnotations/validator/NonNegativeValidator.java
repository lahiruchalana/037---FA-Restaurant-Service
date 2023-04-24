package com.example.restaurant_service.configuration.customAnnotations.validator;

import com.example.restaurant_service.configuration.customAnnotations.NonNegative;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NonNegativeValidator implements ConstraintValidator<NonNegative, Integer> {
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value == null || value >= 0;
    }
}