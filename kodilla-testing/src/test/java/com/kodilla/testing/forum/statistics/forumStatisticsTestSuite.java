package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ForumStatisticsTestSuite {
    static int counter = 0;

     ForumStatistics forumStatisticsTest = new ForumStatistics();

    private List<String> generateListOfNUsers(int quantityOfUsers){
        List<String> usersList = new ArrayList<>();
        for (int n = 1; n <= quantityOfUsers; n++){
            usersList.add("User " + n);
        }
        return usersList;
    }

    @BeforeEach
    public void beforeEveryTest() {
        counter++;
        System.out.println("Preparing to execute test #" + counter);
    }

    @AfterEach
    public void afterEveryTest(){
        System.out.println("Test completed");
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsWith0Posts(){
        //Given
        List<String> usersListMock = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersListMock);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatisticsTest.calculateAdvStatistics(statisticsMock);
        int result = forumStatisticsTest.getQuantityOfPosts();
        double average = forumStatisticsTest.getAverageQuantityPostsOnUser();

        //Then
        Assertions.assertEquals(0, result);
        Assertions.assertEquals(0, average);

    }
    @Test
    void testCalculateAdvStatisticsWith1000Posts(){
        //Given
        List<String> usersListMock = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersListMock);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatisticsTest.calculateAdvStatistics(statisticsMock);
        int result = forumStatisticsTest.getQuantityOfPosts();
        double average = forumStatisticsTest.getAverageQuantityPostsOnUser();

        //Then
        Assertions.assertEquals(1000, result);
        Assertions.assertEquals(10, average);
    }
    @Test
    void testCalculateAdvStatisticsWith0Comments(){
        //Given
        List<String> usersListMock = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersListMock);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatisticsTest.calculateAdvStatistics(statisticsMock);
        int result = forumStatisticsTest.getQuantityOfPosts();
        double average = forumStatisticsTest.getAverageQuantityCommentsForUser();

        //Then
        Assertions.assertEquals(0, result);
        Assertions.assertEquals(0, average);
    }
    @Test
    void testCalculateAdvStatisticsWithCommentsMoreThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1);

        //When
        forumStatisticsTest.calculateAdvStatistics(statisticsMock);
        double result = forumStatisticsTest.getAverageQuantityCommentsOnPost();

        //Then
        Assertions.assertEquals(100, result);
    }
    @Test
    void testCalculateAdvStatisticsWithCommentsLessThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        forumStatisticsTest.calculateAdvStatistics(statisticsMock);
        double result = forumStatisticsTest.getAverageQuantityCommentsOnPost();

        //Then
        Assertions.assertEquals(0.01, result);
    }
    @Test
    void testCalculateAdvStatisticsWith0Users(){
        //Given
        List<String> usersListMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersListMock);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        forumStatisticsTest.calculateAdvStatistics(statisticsMock);
        int result = forumStatisticsTest.getQuantityOfUsers();
        double averageCom = forumStatisticsTest.getAverageQuantityCommentsForUser();
        double averagePos = forumStatisticsTest.getAverageQuantityPostsOnUser();

        //Then
        Assertions.assertEquals(0, result);
        Assertions.assertEquals(0, averageCom);
        Assertions.assertEquals(0, averagePos);
    }

    @Test
    void testCalculateAdvStatisticsWith100Users(){
        //Given
        List<String> usersListMock = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersListMock);
        //When
        forumStatisticsTest.calculateAdvStatistics(statisticsMock);
        int result = forumStatisticsTest.getQuantityOfUsers();

        //Then
        Assertions.assertEquals(100, result);
    }


}