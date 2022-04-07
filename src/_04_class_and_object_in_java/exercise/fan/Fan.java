package _04_class_and_object_in_java.exercise.fan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on= false;
    private double radius= 5.0;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//phương thức trả về speed, color, và radius với chuỗi “fan is on”.
    //Nếu quạt không ở trạng thái on, phương thức trả về color
// , radius với chuỗi “fan is off”.
    @Override
    public String toString() {
        if (this.isOn()){
            return "fan is on "+" speed : "+this.getSpeed()+" , color : "+this.getColor()+
                    " , radius : "+this.getRadius()
                    + " , on : "+ this.isOn();
        } else {
            return "fan is off "+" color : "+this.getColor()+" , radius : "+this.getRadius();

        }
    }
}
