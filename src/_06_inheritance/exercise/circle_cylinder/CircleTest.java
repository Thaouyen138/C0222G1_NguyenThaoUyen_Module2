package _06_inheritance.exercise.circle_cylinder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("enter radius");
        double radius = Double.parseDouble(scanner.nextLine());
        circle.setRadius(radius);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("radius circle is : " + circle.getRadius());
        System.out.println("get area is : " + decimalFormat.format(circle.getArea()));

    }
}
