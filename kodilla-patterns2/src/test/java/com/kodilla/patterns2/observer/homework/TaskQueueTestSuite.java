package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdateTask() {
        //Given
        TaskQueue dariusDariusTaskQueue = new StudentDariusDariusTaskQueue();
        TaskQueue andrewAndrewTaskQueue = new StudentAndrewAndrewTaskQueue();
        Mentor jacobEvening = new Mentor("Jacob Jacob");
        Mentor alanAlan = new Mentor("Alan Alan");
        dariusDariusTaskQueue.registerObserver(jacobEvening);
        andrewAndrewTaskQueue.registerObserver(alanAlan);
        //When
        dariusDariusTaskQueue.addTask("task 1");
        dariusDariusTaskQueue.addTask("task 2");
        andrewAndrewTaskQueue.addTask("task 3");
        andrewAndrewTaskQueue.addTask("task 4");
        //Then
        assertEquals(2, alanAlan.getUpdateCount());
        assertEquals(2, jacobEvening.getUpdateCount());
    }

    @Test
    public void testRemoveObserver() {
        //Given
        Mentor jacobJacob = new Mentor("Jacob Jacob");
        TaskQueue johnJohnTaskQueue = new StudentJohnJohnTaskQueue();
        TaskQueue andrewAndrewTaskQueue = new StudentAndrewAndrewTaskQueue();
        johnJohnTaskQueue.registerObserver(jacobJacob);
        andrewAndrewTaskQueue.registerObserver(jacobJacob);

        //When
        johnJohnTaskQueue.addTask("task 5");
        andrewAndrewTaskQueue.addTask("task 6");
        johnJohnTaskQueue.removeObserver(jacobJacob);
        johnJohnTaskQueue.addTask("task 7");

        //Then
        assertEquals(2, jacobJacob.getUpdateCount());
    }
}
