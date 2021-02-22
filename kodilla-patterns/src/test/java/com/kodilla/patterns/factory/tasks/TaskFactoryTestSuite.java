package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOOPING_TASK);
        shopping.executeTask();
        //Then
        Assert.assertEquals(shopping.getTaskName(), "Let's go to shop and buy");
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //Then
        Assert.assertEquals(painting.getTaskName(), "Let's paint for mom");
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Then
        Assert.assertEquals(driving.getTaskName(), "Let's drive to");
        Assert.assertTrue(driving.isTaskExecuted());
    }

}