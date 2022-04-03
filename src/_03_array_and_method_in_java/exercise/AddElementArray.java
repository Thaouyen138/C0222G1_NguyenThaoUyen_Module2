package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        int[] array = new int[size + 1];
        int i = 0;
        while (i < array.length-1) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.println(Arrays.toString(array));


        System.out.println("EEnter ìndex to add");
        int index = Integer.parseInt(scanner.nextLine());
        if(index >= array.length || index < 0){
            System.out.println("Element does not exist in array");
        }else{
        for (int k = array.length - 1; k > index; k--) {
            array[k] = array[k - 1];
        }
        System.out.println("Enter Element to add");
        int element = Integer.parseInt(scanner.nextLine());
        array[index] = element;
    }


        System.out.println(Arrays.toString(array));

    }
}
