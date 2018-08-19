package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @After
    public void afterEveryTest() {
        System.out.println("Test nr #" + testCounter + " finished");
    }
    @Test
    public void addingFigure() {
        //Given
        Shape circle = new Circle("circle", 2);
        Shape triangle = new Triangle("triangle", 2, 4);
        Shape square = new Square("square", 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }
    @Test
    public void removingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 2, 4);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.removeFigure(triangle);

        //Then
        Assert.assertEquals(0, shapeCollector.figures.size());
    }
    @Test
    public void gettingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("circle", 2);
        shapeCollector.addFigure(circle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);
    }
    @Test
    public void showingFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("circle", 2);
        shapeCollector.addFigure(circle);
        //When
        String result = shapeCollector.showFigures();
        //Then
        Assert.assertEquals("circle", result);
    }
}
