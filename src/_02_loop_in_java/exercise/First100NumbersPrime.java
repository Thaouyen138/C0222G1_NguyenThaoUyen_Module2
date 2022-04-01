package _02_loop_in_java.exercise;

import java.util.Scanner;

public class First100NumbersPrime {

    public static void main(String[] args) {
        int num = 1;
        while (num < 100) {

            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num%i==0){
                    count++;
                }
            }if (count==2){
                System.out.println(num);

            }num++;

        }

    }
}