package _07_abstract_and_interface.exercise.interface_colorable;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] =  new Square(4);
        shapes[1] =  new Circle(3);
        System.out.print("Area of shapes:");
        for (Shape shape:shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof IColorable) {
                ((Square)shape).howToColor();
            }
        }
    }
}



