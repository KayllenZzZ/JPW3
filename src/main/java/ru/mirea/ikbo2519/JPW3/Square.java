package ru.mirea.ikbo2519.JPW3;

public class Square extends Rectangle {

    protected double Side;

    public Square(double side) {
        super();
        Side = side;
    }

    public Square(double width, double length, double side) {
        super(width, length);
        Side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        Side = side;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "\nSide: " + Side +
                "\nwidth: " + width +
                "\nlength: " + length +
                "\ncolor: " + color +
                "\nfilled:" + filled ;
    }
}
