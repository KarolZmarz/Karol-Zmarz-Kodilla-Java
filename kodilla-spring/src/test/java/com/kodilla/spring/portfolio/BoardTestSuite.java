package com.kodilla.spring.portfolio;

import com.kodilla.spring.porfolio.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
    //Given
        String toDo = "task to do";
        String inProgress = "task in progress";
        String done = "task done";

        board.getToDoList().addTask(toDo);
        board.getInProgressList().addTask(inProgress);
        board.getDoneList().addTask(done);

        //When
        String task1 = board.getToDoList().getTasks().get(0);
        String task2 = board.getInProgressList().getTasks().get(0);
        String task3 = board.getDoneList().getTasks().get(0);

        //Then
        assertEquals(toDo, task1);
        assertEquals(inProgress, task2);
        assertEquals(done, task3);
    }
}
