package com.amigoscode._3_oop._4_polymorphism;

import com.amigoscode._3_oop._3_abstractclasses.Circle;
import com.amigoscode._3_oop._3_abstractclasses.Rectangle;
import com.amigoscode._3_oop._3_abstractclasses.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: Polymorphism - Shape Calculator
 *
 * Use polymorphism to write methods that work with any Shape.
 * Because Circle and Rectangle both extend Shape, a single method
 * can handle both — and any future Shape subclass — without modification.
 *
 * Key concepts:
 * - Methods that accept a supertype parameter
 * - Polymorphic collections (List<Shape>)
 * - instanceof with pattern matching (Java 16+)
 * - Open/closed principle in practice
 *
 * Prerequisites: Complete Shape.java, Circle.java, and Rectangle.java first.
 */

public class ShapeCalculator {

    // TODO: 1 - Create a method: void printShapeArea(Shape shape)
    //   Print: "The <className> has an area of <area>"
    //   Use shape.getClass().getSimpleName() to get the class name.
    //   Use String.format("%.2f", shape.area()) for formatting.
    void printShapeArea(Shape shape) {
        System.out.printf(
                "The %s has an area of %.2f \n",
                shape.getClass().getSimpleName(),
                shape.area()
        );
    }


    // TODO: 2 - Create a method: double totalArea(List<Shape> shapes)
    //   Iterate over all shapes and return the sum of their areas.
    double totalArea(List<Shape> shapes) {
        double sum = 0.0;
        for (Shape shape : shapes) sum += shape.area();
        return sum;
    }


    // TODO: 3 - Create a method: Shape largestShape(List<Shape> shapes)
    //   Return the shape with the largest area.
    //   If the list is empty, return null.
    Shape largestShape(List<Shape> shapes) {
        if(shapes.isEmpty()) return null;

        Shape result = shapes.getFirst();
        for (Shape shape : shapes) {
            if (result == shape) continue;
            if (shape.area() > result.area()) result = shape;
        }
        return result;
    }


    // TODO: 4 - Create a method: String describeShape(Shape shape)
    //   Use instanceof with pattern matching (Java 16+) to return
    //   specific descriptions:
    //   - If shape is a Circle c: return "Circle with radius info"
    //     (just return "Circle detected with area: " + c.area())
    //   - If shape is a Rectangle r: return "Rectangle detected with area: " + r.area()
    //   - Otherwise: return "Unknown shape with area: " + shape.area()
    String describeShape(Shape shape) {
        if(shape instanceof Circle c) return String.format("Circle detected with area: %.2f", c.area());
        if(shape instanceof Rectangle r) return String.format("Rectangle detected with area: %.2f", r.area());
        return String.format("Unknown shape with area: %.2f", shape.area());
    }


    // TODO: 5 - Create a method: String formatSummary(List<Shape> shapes)
    //   Return a formatted summary string like:
    //   "Summary: <N> shapes, total area: <totalArea>, largest area: <largestArea>"
    //   Use the totalArea() and largestShape() methods you already wrote.
    String formatSummary(List<Shape> shapes) {
        return String.format(
                "Summary: %d shapes, total area: %.2f, largest area: %.2f",
                shapes.size(),
                totalArea(shapes),
                largestShape(shapes).area()
        );
    }


    // TODO: 6 - In main, create a List<Shape> with at least two Circles
    //   and two Rectangles. Call all the methods above and print results.
    //   This demonstrates polymorphism: the same method handles
    //   different shape types seamlessly.

    public static void main(String[] args) {
        // Complete TODO 6 here.
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        List<Shape> shapes = new ArrayList<>(List.of(
                new Circle(10.0),
                new Circle(20.0),
                new Rectangle(4.0, 5.0),
                new Rectangle(4.0, 5.0)
        ));

        for (Shape shape : shapes) {
            System.out.println(shapeCalculator.describeShape(shape));
            shapeCalculator.printShapeArea(shape);
        }

        System.out.println(shapeCalculator.formatSummary(shapes));
    }
}
