package _02_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayGeometricTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Enter your choice:\n" +
                    "1.Print the rectangle\n" +
                    "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "3.Print isosceles triangleisosceles triangle\n" +
                    "Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    squareTriangle();
                    break;
                case 3:
                case 4:
                    System.exit(0);
                    break;
            }

        }
    }

    public static void rectangle() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void squareTriangle() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        do {
            System.out.println("Choice square triangle display:\n" +
                    "1:square triangle in top-left\n" +
                    "2.square triangle in top-right\n" +
                    "3:square triangle in botton-left\n" +
                    "4.square triangle botton-right\n" +
                    "Enter your choice");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Triangle top-left");
                    topLeft();
                    break;
                case 2:
                    System.out.println("Triangle top-right");
                    topRight();
                    break;
                case 3:
                    System.out.println("Triangle botton-left");
                    bottonLeft();
                    break;
                case 4:
                    System.out.println("Triangle botton-right");
                    bottonRight();
                    break;
            }
        } while (check);
    }

    public static void topLeft() {
        for (int i = 1; i < 6; i++) {

            for (int j = i; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }



    public static void topRight() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void bottonLeft() {
        for (int i = 1; i < 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void bottonRight() {
        for (int i = 1; i < 6; i++) {

            for (int j = i + 1; j < 6; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void isoscelesTriangle(){
        for (int i=1;i<7;i++){
            for (int j=i;j<i;j++){
                System.out.print("*");

            }
        }
    }
}


