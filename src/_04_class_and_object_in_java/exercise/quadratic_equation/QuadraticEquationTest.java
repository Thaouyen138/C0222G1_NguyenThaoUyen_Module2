package _04_class_and_object_in_java.exercise.quadratic_equation;

import java.net.DatagramPacket;
import java.util.Scanner;

public class QuadraticEquationTest{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a:");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.print("enter b:");
        double b= Double.parseDouble(scanner.nextLine());
        System.out.print("enter c:");
        double c=Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        double delta=quadraticEquation.getDiscriminant();
        if (delta==0){
            System.out.print("roof:");
            System.out.println(quadraticEquation.getRoof());
        }else if (delta>0) {
            System.out.print("roof1:");
            System.out.println(quadraticEquation.getRoof1());
            System.out.print("roof2:");
            System.out.println(quadraticEquation.getRoof2());
        }else {
            System.out.println("Equation isn't solution");
        }

    }

}
