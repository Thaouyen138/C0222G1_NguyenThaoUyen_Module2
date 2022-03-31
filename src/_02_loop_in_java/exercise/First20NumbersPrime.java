package _02_loop_in_java.exercise;

import java.util.Scanner;

public class First20NumbersPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the prime number to print:");
        int number=Integer.parseInt(scanner.nextLine());
        int count=0;
        int so=2;
        while (count<number){
            boolean check=true;
            for (int i=2;i<=Math.sqrt(so);i++){
                if (so%i==0){
                    check=false;
                }
            }
            if (check){
                System.out.println(so);
                count++;
            }
            so++;
        }
    }
}
