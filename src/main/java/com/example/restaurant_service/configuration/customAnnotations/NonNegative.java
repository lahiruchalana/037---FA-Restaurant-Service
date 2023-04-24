package com.example.restaurant_service.configuration.customAnnotations;

import com.example.restaurant_service.configuration.customAnnotations.validator.NonNegativeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NonNegativeValidator.class)
public @interface NonNegative {
    String message() default "Value must be non-negative";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}