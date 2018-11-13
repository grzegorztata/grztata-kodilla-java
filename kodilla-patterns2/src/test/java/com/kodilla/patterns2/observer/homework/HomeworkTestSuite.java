package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void homeworkTests() {
        //Given
        HomeworkList homeworkList1 = new HomeworkList("Task 1");
        HomeworkList homeworkList2 = new HomeworkList("Task 2");
        HomeworkList homeworkList3 = new HomeworkList("Task 3");
        HomeworkList homeworkList4 = new HomeworkList("Task 4");
        Mentor firstMentor = new Mentor("First Mentor");
        Mentor secondMentor = new Mentor("Second Mentor");
        homeworkList1.registerObserver(firstMentor);
        homeworkList2.registerObserver(firstMentor);
        homeworkList3.registerObserver(firstMentor);
        homeworkList4.registerObserver(secondMentor);
        homeworkList1.registerObserver(firstMentor);
        //When
        homeworkList1.addTask("FirstTask");
        homeworkList2.addTask("SecondTask");
        homeworkList3.addTask("ThirdTask");
        homeworkList4.addTask("FourthTask");
        //Then
        assertEquals(4, firstMentor.getUpdateCount());
        assertEquals(1, secondMentor.getUpdateCount());
    }
}
