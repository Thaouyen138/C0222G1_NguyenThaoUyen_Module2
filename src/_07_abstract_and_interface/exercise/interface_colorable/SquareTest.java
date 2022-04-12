package _07_abstract_and_interface.exercise.interface_colorable;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Square square=new Square();
        Circle circle=new Circle();
        System.out.print("enter side square:");
        double side=Double.parseDouble(scanner.nextLine());
        square.setSide(side);
        System.out.println("get area square:"+square.getArea());
        System.out.println("get perimater square:"+square.getPerimater());
        Shape[] shapes=new Shape[1];
        shapes[0]=square;
        shapes[1]=circle;
        for (int i=0;i<shapes.length;i++){
            if (shapes[i].equals(square)){}
            square.howToColor();
        }

       }

    }

