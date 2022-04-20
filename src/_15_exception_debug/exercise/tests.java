package _15_exception_debug.exercise;

import java.util.Scanner;

public class tests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("enter size1 :");
            double s1 = Double.parseDouble(scanner.nextLine());
            System.out.print("enter size2 :");
            double s2 = Double.parseDouble(scanner.nextLine());
            System.out.print("enter size3 :");
            double s3 = Double.parseDouble(scanner.nextLine());
            if (s1 < 0 || s2 < 0 || s3 < 0) {
                throw new IllegalTriangleExceptions("number small 0,isn't triangle");
            }
            if (s1 + s2 < s3 || s1 + s3 < s2 || s3 + s2 < s1) {
                throw new IllegalTriangleExceptions("number is small,is not triangle");
            }
        } catch (IllegalTriangleExceptions illegalTriangleExceptions) {
            System.out.println(illegalTriangleExceptions.getMessage());
            //            illegalTriangleExceptions.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            System.out.println("wrong format!");
        }
    }
}
