package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " completed successfully");
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(square,shapeCollector.getFigure(0));
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4);
        Triangle triangle = new Triangle(2,3);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(triangle,shapeCollector.getFigure(0));
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4);
        Circle circle = new Circle(4);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(square,shapeCollector.getFigure(0));
        Assert.assertEquals(circle,shapeCollector.getFigure(1));
    }

}