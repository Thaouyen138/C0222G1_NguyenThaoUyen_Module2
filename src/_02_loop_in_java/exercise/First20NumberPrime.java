package _02_loop_in_java.exercise;

import java.util.Scanner;

public class First20NumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount number prime to print");
        int number = Integer.parseInt(scanner.nextLine());
//        int i=0;
//        while ( i<=number){
//            int num=1;
//            int count =0;
//            int amount=0;
//            for (int j = 1; j <=num ; j++) {
//                if (num%j==0){
//                    count++;
//                }if (count==2){
//                    System.out.println(num);
//                    amount++;
//                }
//            }num++;
//        }

        int num = 1;
        int amount = 0;
        while (amount < number) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.println(num);
                amount++;
            }
            num++;
        }
    }
}
