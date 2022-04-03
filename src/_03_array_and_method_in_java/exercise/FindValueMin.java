package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindValueMin {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int size = -1;
        do {
            System.out.print("Enter a size:");
            size =Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Element index "+i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Value min in array :"+min);
    }
}
