package com.example.restaurant_service.configuration.customAnnotations.validator;

import com.example.restaurant_service.configuration.customAnnotations.NotEmptyOrNull;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class NotEmptyOrNullValidator implements ConstraintValidator<NotEmptyOrNull, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && !value.trim().isEmpty();
    }
    public static boolean isNotNullOrEmpty(String text) {
        return null != text && !text.trim().isEmpty();
    }
    public static boolean isNullObject(Object object) {
        return null != object;
    }
    public static boolean isNullOrEmptyList(List<?> text) {
        return null != text && !text.isEmpty();
    }
}
