package _05_access_modifier_static_method_property.exercise.access_modifier;

import _05_access_modifier_static_method_property.exercise.access_modifierr.Circle;

public class CircleTest {
    public static void main(String[] args) {
       Circle circle=new Circle(3.5);
        System.out.println(" Radius : " + circle.getRadius());
        System.out.println(" Get Area : " +circle.getArea());
    }
}
