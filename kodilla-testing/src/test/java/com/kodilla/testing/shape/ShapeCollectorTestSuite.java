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
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        //When
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(triangle,shapeCollector.getFigure(0));
    }
    @Test
    public void testGetFigure() {
        //Given
        Square square = new Square(2);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(2, 3);
        ShapeCollector shapeCollectorTest = new ShapeCollector();
        shapeCollectorTest.addFigure(square);
        shapeCollectorTest.addFigure(circle);
        shapeCollectorTest.addFigure(triangle);
        //When
        Shape shape1 = shapeCollectorTest.getFigure(0);
        Shape shape2 = shapeCollectorTest.getFigure(1);
        Shape shape3 = shapeCollectorTest.getFigure(2);
        //Then
        Assert.assertEquals(square, shape1);
        Assert.assertEquals(circle, shape2);
        Assert.assertEquals(triangle, shape3);
    }

    @Test
    public void testShowFigures() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(5, 3);
        Square square = new Square(12);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //when
        shapeCollector.showFigures();
    }

}