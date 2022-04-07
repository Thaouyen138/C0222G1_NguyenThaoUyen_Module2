package _06_inheritance.exercise.design_and_impl_geometric;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Shape shape=new Shape();
        Triangle triangle=new Triangle();
        System.out.println("triangle color 1: "+shape.getColor());
        System.out.println("get area 1: "+triangle.getArea());
        System.out.println("perimeter 1: "+triangle.getPerimeter());
        System.out.print("enter color triangle:");
        String cl=scanner.nextLine();
        shape.setColor(cl);
        System.out.print("enter side triangle:");
        double sd=Double.parseDouble(scanner.nextLine());
        triangle.setSide1(sd);

        System.out.println("triangle color 2: "+shape.getColor());
        System.out.println("get area 2: "+triangle.getArea());
        System.out.println("perimeter 2: "+triangle.getPerimeter());
    }
}
