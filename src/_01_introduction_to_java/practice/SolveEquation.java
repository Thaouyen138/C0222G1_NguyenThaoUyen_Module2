package _01_introduction_to_java.practice;

import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("enter b:");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("enter c:");
        float c = Float.parseFloat(scanner.nextLine());
        float x;
        if (a != 0) {
            x = (c - b) / a;
            System.out.println("valid equation:" + x);
        } else if (b == c) {
            System.out.print("The solution is all x!");
        } else {
            System.out.print("No solution!");
        }

    }
}

