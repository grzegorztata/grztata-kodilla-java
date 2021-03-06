package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When Then
        board.getToDoList().addTask("TaskOne");
        board.getInProgressList().addTask("TaskTwo");
        board.getDoneList().addTask("TaskThree");

    }
}