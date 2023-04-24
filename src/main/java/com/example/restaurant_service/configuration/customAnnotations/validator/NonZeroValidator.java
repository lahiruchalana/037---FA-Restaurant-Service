package com.example.restaurant_service.configuration.customAnnotations.validator;


import com.example.restaurant_service.configuration.customAnnotations.NonZero;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NonZeroValidator implements ConstraintValidator<NonZero, Integer> {
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value == null || value == 0 || value >= 0;
    }
}
