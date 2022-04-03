package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMaxValueArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row;
        int col;

        System.out.println("Enter rowspan ");
        row= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter colspan:");
        col = Integer.parseInt(scanner.nextLine());
        int[][] Array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            }
        }
    }
}