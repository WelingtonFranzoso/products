package com.franzoso.products.infra;

public class ExceptionDTO {

    private String message;

    public ExceptionDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
