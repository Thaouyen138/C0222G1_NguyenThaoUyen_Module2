package _02_loop_in_java.practice;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter money to loan:");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("enter a month to loan:");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("enter interest rate:");
        double interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;

        }
        System.out.println("total interest after " + month + " month is " + totalInterest);
    }
}

