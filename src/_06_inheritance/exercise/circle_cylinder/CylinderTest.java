package _06_inheritance.exercise.circle_cylinder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter radius volume:");
        double radius=Double.parseDouble(scanner.nextLine());
        System.out.println("enter height volume:");
        double height=Double.parseDouble(scanner.nextLine());

        cylinder.setRadius(radius);
        cylinder.setHeight(height);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("get area volume: " + decimalFormat.format(cylinder.getVolume()));
    }

}
