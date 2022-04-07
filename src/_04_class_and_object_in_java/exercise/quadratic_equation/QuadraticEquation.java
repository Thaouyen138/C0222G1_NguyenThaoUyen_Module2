package _04_class_and_object_in_java.exercise.quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    double delta;
    double getRoof1;
    double getRoof2;
    double getRoof;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }



    public double getDiscriminant() {

        return delta = (this.b * this.b) - 4 * a * c;
    }

    public double getRoof() {

        return getRoof = (-this.b) / (2 * a);
    }

    public double getRoof1() {

        return getRoof1 = (-this.b + Math.sqrt(delta)) / 2 * a;
    }

    public double getRoof2() {

        return getRoof2 = (-this.b - Math.sqrt(delta)) / 2 * a;

    }
}
