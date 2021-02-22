package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String FIRST_VARIABLE = "VARIABLE_FIRST";
    public static final String SECOND_VARIABLE = "VARIABLE_SECOND";
    public static final String THIRD_VARIABLE = "VARIABLE_THIRD";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case FIRST_VARIABLE:
                return new ShoppingTask("Let's go to shop and buy", "bread", 10);
            case SECOND_VARIABLE:
                return new PaintingTask("Let's paint for mom", "red", "flowers");
            case THIRD_VARIABLE:
                return new DrivingTask("Let's drive to", "airport", "shuttle bus");
            default:
                return null;
        }

    }
}