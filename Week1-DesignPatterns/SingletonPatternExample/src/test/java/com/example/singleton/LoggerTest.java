package com.example.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class LoggerTest {

    @Test
    void testOnlyOneLoggerInstanceExists() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2, "Logger.getInstance() should always return the same instance");
    }
}
