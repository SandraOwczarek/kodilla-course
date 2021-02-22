package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOOPING_TASK = "SHOOPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOOPING_TASK:
                return new ShoppingTask("Let's go to shop and buy", "bread", 10);
            case PAINTING_TASK:
                return new PaintingTask("Let's paint for mom", "red", "flowers");
            case DRIVING_TASK:
                return new DrivingTask("Let's drive to", "airport", "shuttle bus");
            default:
                return null;
        }

    }
}