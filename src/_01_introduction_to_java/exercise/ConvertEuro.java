package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ConvertEuro {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a usd");
        float usd=Float.parseFloat(scanner.nextLine());
        float moneyVnd=usd*23000;
        System.out.println(usd +" usd to vnd:" + moneyVnd +"VNĐ");
    }
}
