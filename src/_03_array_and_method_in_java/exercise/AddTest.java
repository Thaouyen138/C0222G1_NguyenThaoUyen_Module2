package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5,0};
        System.out.println(Arrays.toString(array));
        System.out.println("vị trí cần thêm");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i=array.length-1;i>index;i--){
            array[i]=array[i-1];

        }
        System.out.println("nhap phan tử");
        int element=Integer.parseInt(scanner.nextLine());
        array[index]=element;


        System.out.println(Arrays.toString(array));

    }
}
