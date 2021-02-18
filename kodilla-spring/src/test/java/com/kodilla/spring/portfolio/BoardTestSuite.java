package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class BoardTestSuite  {

    @Test
    void testTaskAdd()  {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "Buy groceries";
        String taskInProgress = "Cooking Dinner";
        String taskDone = "Clean after dinner";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        Assertions.assertEquals("Buy groceries", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Cooking Dinner", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Clean after dinner", board.getDoneList().getTasks().get(0));
    }

}