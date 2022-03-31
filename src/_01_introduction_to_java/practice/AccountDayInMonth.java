package _01_introduction_to_java.practice;

import java.util.Scanner;

public class AccountDayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Which month that you want to count days? ");
            int month = Integer.parseInt(scanner.nextLine());
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Month " + month + " has 31 day\n");
                    break;
                case 2:
                    System.out.println("Month " +month+ " has 28 or 29 day\n");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Month " +month+ " has 30 day\n");
                    break;
                case 0:
                    check=false;
                default:
                    System.out.println("No exist month");
            }

        }while (check);
    }
}