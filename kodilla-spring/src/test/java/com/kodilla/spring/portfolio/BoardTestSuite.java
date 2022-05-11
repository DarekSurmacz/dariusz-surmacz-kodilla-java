package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("To do");
        board.getInProgressList().tasks.add("In progress");
        board.getDoneList().tasks.add("Done");

        //Then
        assertEquals("To do", board.getToDoList().getTasks().get(0));
        assertEquals("In progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Done", board.getDoneList().getTasks().get(0));
    }
}
