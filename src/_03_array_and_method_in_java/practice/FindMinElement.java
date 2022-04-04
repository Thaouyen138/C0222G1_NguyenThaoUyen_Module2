package _03_array_and_method_in_java.practice;

public class FindMinElement { public static void main(String[] args) {
    int[] arr = {2,3,4,9,8,7};
    int index = minValue(arr);
    System.out.println("Element min in array is: " + arr[index]);
}

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

}
