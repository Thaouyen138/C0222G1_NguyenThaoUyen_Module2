package _04_class_and_object_in_java.exercise.fan;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FanTest {
    public static void main(String[] args) {
        // Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
        //Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        Fan fan1=new Fan(Fan.FAST,true,10,"yellow");
        Fan fan2=new Fan(Fan.MEDIUM, false, 5,"blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
