package _07_abstract_and_interface.exercise.interface_colorable;

public class Square extends Shape implements IColorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, double radius) {
        super(color);
        this.side = radius;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }
    public double getPerimater(){
        return this.side*4;
    }
    @Override
    public String toString() {
        return super.toString()+
                "radius=" + side +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.print("Color all four sides..");
    }
}
