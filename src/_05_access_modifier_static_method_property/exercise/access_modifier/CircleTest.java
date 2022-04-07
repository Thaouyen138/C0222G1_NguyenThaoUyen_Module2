package _05_access_modifier_static_method_property.exercise.access_modifier;

import _05_access_modifier_static_method_property.exercise.access_modifierr.Circle;

import java.text.DecimalFormat;

public class CircleTest {
    public static void main(String[] args) {
       Circle circle=new Circle(3.5);
        DecimalFormat decimalFormat=new DecimalFormat("#.##");
        System.out.println(" Radius : " + circle.getRadius());
        System.out.println(" Get Area : " +decimalFormat.format(circle.getArea()));
    }
}
