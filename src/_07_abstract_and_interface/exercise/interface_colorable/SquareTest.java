package _07_abstract_and_interface.exercise.interface_colorable;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape square = new Square();
       Shape circle = new Circle();
        System.out.print("enter side square:");
        double side = Double.parseDouble(scanner.nextLine());
        ((Square)square).setSide(side);
        System.out.println("get area square:" + ((Square)square).getArea());
        System.out.println("get perimater square:" + ((Square)square).getPerimater());
        Shape[] shapes = new Shape[1];
        shapes[0] = square;
        shapes[1] = circle;

            for (int i = 0; i < shapes.length; i++) {
                if (shapes[i].equals(square)) {
                }
              square.howToColor();
        }
    }
       }



