package com.example.singleton;

public final class Logger {
    private static final Logger instance = new Logger();

    private Logger() {
    
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOGGER] " + message);
    }
}
