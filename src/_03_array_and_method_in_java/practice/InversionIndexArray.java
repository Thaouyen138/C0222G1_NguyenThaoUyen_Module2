package _03_array_and_method_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class InversionIndexArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size doesn't exceed 20");
        } while (size >20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println("element array:");
            System.out.println(Arrays.toString(array));
            break;
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
//
        for (int j = 0; j < array.length; j++) {
            System.out.println("inversion in array");
            System.out.print(Arrays.toString(array));
            break;
        }
    }
}
