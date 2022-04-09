package _07_abstract_and_interface.exercise.interface_resizeable;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();
        System.out.println("enter side square:");
        double side = Double.parseDouble(scanner.nextLine());
        square.setSide(side);
        System.out.println("get area square is: "+square.getArea());
        System.out.println("get perimeter is: "+square.getPerimeter());

    }
}
