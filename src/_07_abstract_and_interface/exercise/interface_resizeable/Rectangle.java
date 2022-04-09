package _07_abstract_and_interface.exercise.interface_resizeable;

public class Rectangle implements IResizeable {
    private  double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return  this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight()*(1+percent));
        setWidth(getWidth()*(1+percent));
    }
}
