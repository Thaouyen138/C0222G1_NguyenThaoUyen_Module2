package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValueArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rowspan ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter colspan:");
        int col = Integer.parseInt(scanner.nextLine());
        findMaxValue(row, col);
    }

    public static void findMaxValue(int row, int col) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vị trí phần tử vị trí hàng: " + (i) + " và cột: " + j);

                array[i][j] = Integer.parseInt(scanner.nextLine());

            }
        }
        System.out.println(Arrays.deepToString(array));
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }

            }

        }
        System.out.println("max " + max);
    }
}
