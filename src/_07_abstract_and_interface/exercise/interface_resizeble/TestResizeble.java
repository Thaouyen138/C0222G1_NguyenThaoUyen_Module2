package _07_abstract_and_interface.exercise.interface_resizeble;

import java.util.Scanner;

public class TestResizeble {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        Square square = new Square();
        Rectangle rectangle=new Rectangle();
        Circle circle = new Circle();
            System.out.println("get area rectangle is: "+square.getArea());
            System.out.println("get perimeter is: "+square.getPerimeter());
            square.resize(1.0);
            System.out.println("get area square increase is: "+square.getArea());
            square.resize(1.0);
            System.out.println("get perimeter square increase is: "+square.getPerimeter());

        System.out.println("get area rectangle is: "+rectangle.getArea());
        System.out.println("get perimeter is: "+rectangle.getPerimeter());
        rectangle.resize(1.0);
        System.out.println("get area rectangle increase is: "+rectangle.getArea());
        rectangle.resize(1.0);
        System.out.println("get perimeter rectangle increase is: "+rectangle.getPerimeter());


        System.out.println("get area circle is: "+circle.getArea());
        System.out.println("get perimeter circle is: "+circle.getPerimeter());
        circle.resize(1.0);
        System.out.println("get area circle increase is: "+circle.getArea());
        circle.resize(1.0);
        System.out.println("get perimeter circle increase is: "+circle.getPerimeter());
    }
}
