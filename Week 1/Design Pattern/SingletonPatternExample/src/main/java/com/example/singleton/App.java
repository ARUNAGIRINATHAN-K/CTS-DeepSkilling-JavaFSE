package com.example.singleton;

public class App {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Logger instance reused.");

        System.out.println("Same instance: " + (logger1 == logger2));
    }
}
