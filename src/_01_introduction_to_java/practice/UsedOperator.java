package _01_introduction_to_java.practice;

import java.util.Scanner;

public class UsedOperator {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter weigth rectangle:");
        width=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter heigth rectangle:");
        heigth=Float.parseFloat(scanner.nextLine());
        float areaRectang ;
        areaRectang = width * heigth;
        System.out.println("Area Rectangle" + areaRectang);
    }
}
