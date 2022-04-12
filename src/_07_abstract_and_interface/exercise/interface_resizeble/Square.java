package _07_abstract_and_interface.exercise.interface_resizeble;

public class Square extends Shape implements IResizeble {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return  this.side*this.side;
    }
    public double getPerimeter(){
        return this.side*4;
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide()*(1+percent));
    }


}
