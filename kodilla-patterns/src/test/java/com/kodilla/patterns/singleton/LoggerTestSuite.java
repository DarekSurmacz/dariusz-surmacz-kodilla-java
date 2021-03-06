package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    //original version
//    @Test
//    void testLastLog() {
//        //Given
//        Logger logger = new Logger();
//
//        //When
//        logger.log("Login123");
//        String logName = logger.getLastLog();
//
//        //Then
//        assertEquals("Login123", logName);
//    }

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("LastLog");
        String logName = logger.getLastLog();

        //Then
        assertEquals("LastLog", logName);
    }

    @Test
    void testGetLastLogWhenMoreLogs() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("NotTheLastLog");
        logger.log("SomeLogButNotLast");
        logger.log("Log(NotLast)");
        logger.log("LastLog");
        String logName = logger.getLastLog();

        //Then
        assertEquals("LastLog", logName);
    }
}
