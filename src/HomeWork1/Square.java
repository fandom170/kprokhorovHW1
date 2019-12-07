package HomeWork1;

public class Square {
    private double side;

    public Square (double side) {
        this.side = side;
    }

    public double getPerimetr() {
        return Math.round(4 * side * 100d)/100d;
    }

    public double getArea() {
        return Math.round(side * side * 100d)/100d;
    }

    public double getSquareSide () {
        return side;
    }

}
