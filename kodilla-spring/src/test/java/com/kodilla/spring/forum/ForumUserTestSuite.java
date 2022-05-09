package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class ForumUserTestSuite {

    @Test
    void testGetUsername() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String username = forumUser.getUsername();

        //Then
        Assert.hasText("John Smith", username);
    }
}
