package com.test.exceptions;

public class YouDontHaveAccessException extends Throwable {

    private static int triesLeft = 3;

    private final String message = "Wrong username or password, can't give access. ";

    @Override
    public String getMessage() {
        return String.format("%s %d tries left.", message, --triesLeft);
    }

}
