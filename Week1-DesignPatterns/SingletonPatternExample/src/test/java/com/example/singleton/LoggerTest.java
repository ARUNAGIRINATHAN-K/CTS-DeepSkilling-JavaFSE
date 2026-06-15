package com.example.singleton;

import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

public class LoggerTest {

    @Test
    void testOnlyOneLoggerInstanceExists() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2, "Logger.getInstance() should always return the same instance");
    }
}
