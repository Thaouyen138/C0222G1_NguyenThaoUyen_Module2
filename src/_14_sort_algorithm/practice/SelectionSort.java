package _14_sort_algorithm.practice;

public class SelectionSort {
    public static void main(String[] args) {
        double[] arr = {-15.54, 78, 45, 99, -45, 54};
        selectionSort(arr);
        for (double a : arr
        ) {
            System.out.println(a);
        }
    }

    public static void selectionSort(double[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    if (min != i) {
                        double temp = arr[min];
                        arr[min] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

        }
    }
}