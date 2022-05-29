package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {
    //    czy metoda findByListName(String listName) działa poprawnie.
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(1, readTaskList.size());

        //ClenUp
        taskListDao.deleteById(id);
    }

}
