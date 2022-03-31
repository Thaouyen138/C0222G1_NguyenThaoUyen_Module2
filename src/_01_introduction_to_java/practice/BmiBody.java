package _01_introduction_to_java.practice;

import java.util.Scanner;

public class BmiBody {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Height:");
        double height=Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Weight:");
         double weight=Double.parseDouble(scanner.nextLine());
            System.out.println( "Bmi body:");
            double bmi=weight/ Math.pow(height,2);
            if (bmi<18.5){
                System.out.println(bmi + "is underweight");
            }else if(bmi<25){
                System.out.println(bmi + "is normal");
            }else if (bmi<30){
                System.out.println(bmi + "is overweight");
            }else {
                System.out.println(bmi +" is obese");
            }



    }
}
