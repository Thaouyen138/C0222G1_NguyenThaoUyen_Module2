package _06_inheritance.exercise.point_2d_point_3d;

import java.util.Arrays;
import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        Scanner scanner =new Scanner(System.in);
        Point3D point3D=new Point3D();
        System.out.print("enter x:");
        float x=Float.parseFloat(scanner.nextLine());
        System.out.print("enter y:");
        float y=Float.parseFloat(scanner.nextLine());
        System.out.print("enter z:");
        float z=Float.parseFloat(scanner.nextLine());
        point2D.setX(x);
        point2D.setY(y);
        point3D.setZ(z);
        point3D.setX(x);
        point3D.setY(y);
        System.out.println("Array  " + Arrays.toString(point2D.getXY()));
        System.out.println(point2D.toString());
        System.out.println("Array " + Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());


    }
}
