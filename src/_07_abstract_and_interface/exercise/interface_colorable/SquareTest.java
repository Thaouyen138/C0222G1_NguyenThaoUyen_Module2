package _07_abstract_and_interface.exercise.interface_colorable;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();
        Circle circle = new Circle();
        System.out.print("enter side square:");
        double side = Double.parseDouble(scanner.nextLine());
        (square).setSide(side);

        System.out.println("get area square:" + square.getArea());
        System.out.println("get perimater square:" + square.getPerimater());
        Shape[] shapes = new Shape[2];
        shapes[0] = square;
        shapes[1] = circle;

        for (Shape shape:shapes) {


            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }
        IColorable iColorable = new IColorable() {
            @Override
            public void howToColor() {
                System.out.println("Colorablse");
            }
        };
        iColorable.howToColor();
    }
}



