package com.example.demo.domain.model.exceptions;

public class ApplicationException extends RuntimeException {

    private static final long serialVersionUID = 8871912307356825638L;

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
