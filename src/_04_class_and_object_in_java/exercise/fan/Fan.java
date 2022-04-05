package _04_class_and_object_in_java.exercise.fan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on= false;
    private double radius= 5.0;
    private String collor= "blue";

    public Fan() {
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
//phương thức trả về speed, color, và radius với chuỗi “fan is on”.
    //Nếu quạt không ở trạng thái on, phương thức trả về color
// , radius với chuỗi “fan is off”.
    @Override
    public String toString() {
        if (this.isOn()){
            return "fan is on "+" speed : "+this.getSpeed()+" , color : "+this.getCollor()+
                    " , radius : "+this.getRadius()
                    + " , on : "+ this.isOn();
        } else {
            return "fan is off "+" color : "+this.getCollor()+" , radius : "+this.getRadius();

        }
    }
}
