package _05_access_modifier_static_method_property.exercise.access_modifierr;

public class Circle {
   private double radius=1.0;
   private String color="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}