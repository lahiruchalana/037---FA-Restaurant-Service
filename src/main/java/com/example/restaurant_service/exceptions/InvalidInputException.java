package com.example.restaurant_service.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvalidInputException extends RuntimeException{

    private String message;

    public InvalidInputException(String message) {
        super(message);
        this.message = message;
    }
}
