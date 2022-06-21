package com.book.io.exception;

public class DataNotFoundException extends RuntimeException{

    private final Long code;
    private final String message;

    public DataNotFoundException(Long code, String message)
    {
        this.code = code;
        this.message = message;
    }

}
