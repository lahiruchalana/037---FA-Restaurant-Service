package com.example.restaurant_service.configuration.customAnnotations;


import com.example.restaurant_service.configuration.customAnnotations.validator.NonZeroValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NonZeroValidator.class)
public @interface NonZero {

    String message() default "Value must be non-zero and non-negative";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
