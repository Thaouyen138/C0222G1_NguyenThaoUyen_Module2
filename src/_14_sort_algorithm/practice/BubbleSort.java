package _14_sort_algorithm.practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr2 = {4, 1, 7, 11, 9, 21, 5, 54, 35, 23, 88};
        bubbleSort(arr2);
        for (int value : arr2) {
            System.out.println(value + " ");
        }
    }
    public static void bubbleSort(int[]arr2) {
        for (int i = 0; i < arr2.length-1; i++) {
            for (int j=arr2.length-1;j>i;j--){
                if (arr2[j]<arr2[j-1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j - 1];
                    arr2[j - 1] = temp;

                }
            }
        }
    }
}