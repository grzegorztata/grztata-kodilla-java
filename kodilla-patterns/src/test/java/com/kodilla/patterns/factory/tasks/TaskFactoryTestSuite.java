package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Go To Grocery", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Go To Work", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
