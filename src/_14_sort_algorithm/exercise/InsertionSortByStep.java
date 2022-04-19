package _14_sort_algorithm.exercise;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void main(String[] args) {
        System.out.print("mảng cần sắp xếp là: ");
        int[] arr = {23, 32, 45, 72, 56, 78, 89, 54, 12};
        insertSortByStep(arr);
        for (int a : arr) {
            System.out.print(a);
        }

    }
    //
    //
    //

    public static void insertSortByStep(int[] arr) {
        int x, y;
        for (int i = 1; i < arr.length; i++) {
           // System.out.println("i=1,a=arr[1] => x=32 ");
            x = arr[i];
            y = i;
          //  System.out.println("x <vị trí trước x:");
            while (y > 0 && x < arr[y - 1]) {

             //   System.out.println("số bé hơn đưa ra trước:");
                arr[y] = arr[y - 1];
                y--;
            }
            arr[y] = x;
            System.out.println(Arrays.toString(arr));
        }

    }
}

