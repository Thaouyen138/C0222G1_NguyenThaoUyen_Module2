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
                    "3.Print isosceles triangle\n" +
                    "Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    squareTriangle();
                    break;
            }

        }
    }

    //
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
                    topLeft();
                case 3:
                    bottonLeft();
                    break;
            }
        } while (check);
    }
    public static void topLeft(){
        for (int i=7;i<0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void bottonLeft() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}


