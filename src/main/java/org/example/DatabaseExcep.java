package org.example;

/**Виключення*/
public class DatabaseExcep extends Exception {
    public DatabaseExcep(String message, Throwable cause) {
        super(message, cause);
    }
}