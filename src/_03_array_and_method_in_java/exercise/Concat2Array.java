package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Concat2Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount element array A");
        int sizeA = Integer.parseInt(scanner.nextLine());
        int[] arrayA = new int[sizeA];
        int iA = 0;
        while(iA < sizeA){
            System.out.println("Enter element position :"+iA);
            arrayA[iA] = Integer.parseInt(scanner.nextLine());
            iA++;
        }
        System.out.println("Enter amount element array B");
        int sizeB = Integer.parseInt(scanner.nextLine());
        int[] arrayB = new int[sizeB];
        int iB = 0;
        while(iB < sizeB){
            System.out.println("Enter element position :"+iB);

            arrayB[iB] = Integer.parseInt(scanner.nextLine());
            iB++;
        }
        System.out.println(Arrays.toString(arrayA)+" "+Arrays.toString(arrayB));

        int[] arrayC = new int[sizeA+sizeB];

        for(int i = 0 ; i<arrayA.length ;i++){
            arrayC[i] = arrayA[i];
        }
        System.out.println(Arrays.toString(arrayC));
        for(int i = sizeA  ;i<arrayC.length;i++){
            arrayC[i] = arrayB[i-sizeA];
        }

        System.out.println(Arrays.toString(arrayC));

    }
}
