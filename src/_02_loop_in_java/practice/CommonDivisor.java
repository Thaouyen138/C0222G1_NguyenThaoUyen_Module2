package _02_loop_in_java.practice;

import java.util.Scanner;

public class CommonDivisor {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number :");
        int a=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number :");
        int b=Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common devisior");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common devisior: " + a);
    }
}
