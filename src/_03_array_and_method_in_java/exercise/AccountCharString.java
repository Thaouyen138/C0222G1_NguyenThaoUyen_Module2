package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class AccountCharString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        System.out.println("Enter char to account");

        char ch = scanner.nextLine().charAt(0);

        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
