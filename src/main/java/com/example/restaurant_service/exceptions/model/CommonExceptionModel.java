package com.example.restaurant_service.exceptions.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonExceptionModel {

    private HttpStatus httpStatus;
    private String message;
    private String exceptionId;

}
