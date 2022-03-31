package _01_introduction_to_java.practice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        do {

            System.out.println("Enter a year to check:");
            int year = Integer.parseInt(scanner.nextLine());
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " is leap year");
            } else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " is leap year:");
            } else {
                System.out.println(year + " isn't leap year:");
            }
            if (year==0) {
                check = false;
            }
        }while (check);
        }
    }
