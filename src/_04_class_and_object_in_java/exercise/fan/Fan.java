package _04_class_and_object_in_java.exercise.fan;

public class Fan {
    final static int SLOW=1;
    final static int MEDIUM=2;
    final static int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String collor;

    public Fan() {
        this.speed=SLOW;
        this.on=false;
        this.radius=5.0;
        this.collor="blue";


    }

    public Fan(int speed, boolean on, double radius, String collor) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.collor = collor;
    }

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", collor='" + collor + '\'' +
                '}';
    }
}
