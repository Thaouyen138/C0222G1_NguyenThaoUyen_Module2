package _05_access_modifier_static_method_property.exercise.build_class_in_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("uyen");
        student.setClasses("C0222G1");
        System.out.println("Name student: "+ student.getName());
        System.out.println("Class: " +student.getClasses());
    }
}
