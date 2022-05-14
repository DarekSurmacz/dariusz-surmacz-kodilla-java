package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskType.SHOPPING_TASK);
        //Then
        assert shopping != null;
        Assertions.assertEquals("Shopping", shopping.getTaskName());
        Assertions.assertEquals("Buying 1.0 of car", shopping.executeTask());
        Assertions.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskType.PAINTING_TASK);
        //Then
        assert painting != null;
        Assertions.assertEquals("Painting", painting.getTaskName());
        Assertions.assertEquals("Painting car pink", painting.executeTask());
        Assertions.assertFalse(painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskType.DRIVING_TASK);
        //Then
        assert driving != null;
        Assertions.assertEquals("Driving", driving.getTaskName());
        Assertions.assertEquals("Driving to Tatra Mountains by car", driving.executeTask());
        Assertions.assertTrue(driving.isTaskExecuted());
    }
}