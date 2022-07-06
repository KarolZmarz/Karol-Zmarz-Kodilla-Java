package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        String taskListName = "Test task list";
        TaskList taskList = new TaskList( taskListName, "Test");
        taskListDao.save(taskList);

        //When
        List<TaskList> taskLists = taskListDao.findByListName(taskListName);
        int listSize = taskLists.size();

        //Then
        assertEquals(1, listSize);

        //CleanUp
        taskListDao.delete(taskList);

    }
}
