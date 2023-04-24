package com.example.restaurant_service.configuration.customAnnotations;


import com.example.restaurant_service.configuration.customAnnotations.validator.NotEmptyOrNullValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NotEmptyOrNullValidator.class)
public @interface NotEmptyOrNull {
    String message() default "Field must not be empty or null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}