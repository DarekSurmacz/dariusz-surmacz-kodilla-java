package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final Task makeTask(final TaskType taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "car", 1);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "pink", "car");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "Tatra Mountains", "car");
            default:
                return null;
        }
    }
}
