package _06_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
//        return super.getRadius()*2*Math.PI*this.height;
        return Math.pow(getRadius(),2)*Math.PI*height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "height=" + height +
                '}';
    }
}
