package _02_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 2) {
            System.out.println(num + " isn't a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " isn't a prime");
            }
        }
    }
}
