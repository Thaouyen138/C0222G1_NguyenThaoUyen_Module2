package _14_sort_algorithm.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("index " + i + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
        bubbleSort(arr);
        for (int arr1 : arr) {
            System.out.println(arr1 + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=arr.length-1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                   arr[j]= arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}