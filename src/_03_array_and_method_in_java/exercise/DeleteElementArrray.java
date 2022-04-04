package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArrray {
    public static void main(String[] args) {
        int[] array = {10, 4, 4, 8, 6, 4, 2, 5, 2, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");

        int input = Integer.parseInt(scanner.nextLine());
        deleteElementArray(array, input);
    }

    public static void deleteElementArray(int array[], int input) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];

                }
                i--;

                array[array.length - 1] = 0;


            }

        }
        System.out.println(Arrays.toString(array));
    }

}
