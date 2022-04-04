package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindValueMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array={1,2,3,4,5,-6,33,-4};
        System.out.println(Arrays.toString(array));
        findValueMin(array);
    }
    public static void findValueMin(int array[]){
        int max=array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min = array[i];
            }else if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Value min in array :"+min);
        System.out.println("Value min in array :"+max);
    }
}
// em làm thêm max ạ =)))
