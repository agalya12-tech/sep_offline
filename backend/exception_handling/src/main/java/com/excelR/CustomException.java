package com.excelR;
// creating custom exception class (unchecked exception)
public class CustomException extends RuntimeException {
    String message;
//    arg const for re-initialize message
    public CustomException(String message) {
       this.message = message;
    }
//     overriding parent method to change parent implementation with child property
    @Override
    public String getMessage() {
        return message;
    }
}
