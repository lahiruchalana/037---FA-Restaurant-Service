package com.example.restaurant_service.exceptions;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomException extends RuntimeException {

    private String message;

    public CustomException(String message) {
        super(message);
        this.message =message;
    }
}
