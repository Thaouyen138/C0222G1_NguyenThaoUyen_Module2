package _14_sort_algorithm.exercise;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {11, 32, 43, 14, 25, 66, 57, 88, 29};
        insertionSort(arr);
        for (int a : arr
        ) {
            System.out.println(a);
        }
    }

    public static void insertionSort(int[] arr) {
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];

            while (i > 0 && x < arr[i - 1]) {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = x;
        }

    }
}
