package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;

    private static final String DESCRIPTION = "Test: Learn Hibernate (part 2)";
    private static final String LISTNAME = "List";

    @Test
    public void testTaskListDao() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        List<TaskList> actualList = taskListDao.findByListName(taskList.getListName());
        int actualTaskListSize = actualList.size();
        String actualTaskListName = taskList.getListName();

        //Then
        assertEquals(1, actualTaskListSize);
        assertEquals(LISTNAME, actualTaskListName);

        //Clean up
        taskListDao.delete(taskList);
    }


}
