package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[]={1,2,3,4,5,6,7,10,0};
        System.out.println(Arrays.toString(array));


        System.out.println("EEnter ìndex to add");
        int index = Integer.parseInt(scanner.nextLine());
        addElemnt(index,array);
    }
    public static  void addElemnt(int index,int array[]){
        Scanner scanner=new Scanner(System.in);
        if(index >= array.length || index < 0){
            System.out.println("Element does not exist in array");
        }else{
        for (int k = array.length-1 ; k > index; k--) {
            array[k] = array[k - 1];
        }
        System.out.println("Enter Element to add");
        int element = Integer.parseInt(scanner.nextLine());
        array[index] = element;
    }


        System.out.println(Arrays.toString(array));

    }
}
