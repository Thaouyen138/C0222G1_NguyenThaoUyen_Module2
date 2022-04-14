package _07_abstract_and_interface.exercise.interface_resizeble;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class TestResizeble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(2);
        shapes[1] = new Rectangle(10, 4);
        shapes[2] = new Circle(3);

        for (Shape sh : shapes
        ) {
            System.out.println(sh.getArea()
            );
        }
        System.out.println("get area resize");
        for (Shape sh2 : shapes
        ) {
            sh2.resize(0.03);
            System.out.println( sh2.getArea());
        }
    }
}
