package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    Statistics statisticsMock;
    StatCounter statisticsCalculator;
    List<String> listOfNames = new ArrayList<String>();
    List<String> emptyUsersList = new ArrayList<String>();
    List<String> hundredUsers = new ArrayList<String>();


    @Before
    public void ListOfNames() {
        statisticsMock = mock(Statistics.class);
        statisticsCalculator = new StatCounter();
        listOfNames.add("Ja");
        listOfNames.add("Ty");
        listOfNames.add("On");
        listOfNames.add("Ona");
        listOfNames.add("Ono");
        listOfNames.add("Inny");
        listOfNames.add("Jeszcze Inny");
        listOfNames.add("Pozostały");
        for (int i = 0; i < 100; i++) {
            hundredUsers.add("setny " + i);
        }
    }

    // gdy liczba postów = 0
    @Test
    public void testCalculateAdvStatisticsPosts0() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCalculator.getPostsCount();
        //Then
        Assert.assertEquals(0, postsCount);
    }

    //gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatisticsPosts1000() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCalculator.getPostsCount();
        //Then
        Assert.assertEquals(1000, postsCount);
    }

    // gdy liczba komentarzy = 0
    @Test
    public void testCalculateAdvStatisticsComments0() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int commentsCount = statisticsCalculator.getCommentsCount();
        //Then
        Assert.assertEquals(0, commentsCount);
    }

    //gdy liczba komentarzy < liczba postów
    @Test
    public void testCalculateCommentsLessThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int commentsCount = statisticsCalculator.getCommentsCount();
        int postsCount = statisticsCalculator.getPostsCount();
        //Then
        Assert.assertEquals(1, commentsCount);
        Assert.assertEquals(10, postsCount);
    }

    //gdy liczba komentarzy > liczba postów
    @Test
    public void testCalculateCommentsMoreThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(1);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int commentsCount = statisticsCalculator.getCommentsCount();
        int postsCount = statisticsCalculator.getPostsCount();
        //Then
        Assert.assertEquals(10, commentsCount);
        Assert.assertEquals(1, postsCount);
    }

    //gdy liczba użytkowników = 0
    @Test
    public void testCalculateUsers0() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(emptyUsersList);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        //Then
        Assert.assertEquals(0, usersCount);
    }

    //gdy liczba użytkowników = 100
    @Test
    public void testCalculateUsers100() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(hundredUsers);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        //Then
        Assert.assertEquals(99, usersCount); //zostawiam jedno dla oblania testu
    }
}

