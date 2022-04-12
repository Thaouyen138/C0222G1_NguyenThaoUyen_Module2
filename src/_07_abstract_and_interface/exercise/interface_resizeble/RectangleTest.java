package _07_abstract_and_interface.exercise.interface_resizeble;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter height rectangle:");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("enter width rectangle:");
        double width = Double.parseDouble(scanner.nextLine());
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        System.out.println("get area rectangle is: "+rectangle.getArea());
        System.out.println("get perimeter is: "+rectangle.getPerimeter());

    }
}
