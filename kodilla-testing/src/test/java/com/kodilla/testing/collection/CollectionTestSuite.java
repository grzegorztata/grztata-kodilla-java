package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    OddNumbersExterminator oddnumbersextermintor = new OddNumbersExterminator();
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting the Test");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("End of the test");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> result = oddnumbersextermintor.exterminator(emptyList);
        System.out.println("Checking empty list");
        //Then
        Assert.assertEquals(emptyList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        ArrayList<Integer> normalList1 = new ArrayList<>();
        normalList1.add(2);
        normalList1.add(4);
        //When
        ArrayList<Integer> result = oddnumbersextermintor.exterminator(normalList);
        System.out.println("Checking normal list");
        //Then
        Assert.assertEquals(normalList1, result);
    }
}