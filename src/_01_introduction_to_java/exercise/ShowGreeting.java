package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=scanner.nextLine();
        System.out.println("Hello " +name);
    }
}
