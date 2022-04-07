package _06_inheritance.exercise.point_moveable_point;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        MoveablePoint moveablePoint = new MoveablePoint();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter x:");
        float x = Float.parseFloat(scanner.nextLine());
        point.setX(x);
        moveablePoint.setX(x);
        System.out.print("enter y:");
        float y = Float.parseFloat(scanner.nextLine());
        point.setY(y);
        moveablePoint.setY(y);
        System.out.print("enter xspeed:");
        float xSpeed = Float.parseFloat(scanner.nextLine());
        moveablePoint.setxSpeed(xSpeed);
        System.out.print("enter yspeed:");
        float ySpeed = Float.parseFloat(scanner.nextLine());
        moveablePoint.setySpeed(ySpeed);
        System.out.println(point.toString());
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}
