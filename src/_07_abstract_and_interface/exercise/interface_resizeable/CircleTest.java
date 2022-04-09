package _07_abstract_and_interface.exercise.interface_resizeable;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("enter radius:");
        double radius = Double.parseDouble(scanner.nextLine());
        circle.setRadius(radius);
        System.out.println("get area circle is: "+circle.getArea());
        System.out.println("get perimeter circle is: "+circle.getPerimeter());


    }
}
