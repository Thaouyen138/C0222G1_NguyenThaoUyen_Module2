package _04_class_and_object_in_java.exercise.stop_watch;

import java.util.Arrays;

public class StopWatchTest {


    public static void main(String[] args) {
        int[] array = new int[100000];
        int max = 0;
        int min = 0;
//        Random random = new Random();
//        int randomNumber = random.nextInt(max + 1 - min) + min;
//        System.out.println(randomNumber);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        System.out.println(Arrays.toString(array));
        StopWatchTest ob = new StopWatchTest();
        StopWatch stopWatch = new StopWatch();
        long a=  stopWatch.start();
        System.out.println(a);
        System.out.println("Mảng ban đầu:");
        ob.printArray(array);
        ob.sort(array);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(array);
        long b= stopWatch.stop();
        System.out.println(b);
        System.out.println("Time : " + (b-a));
    }

    static void sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Xuất mảng
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
