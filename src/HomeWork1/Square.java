package HomeWork1;

public class Square {
    private double side;

    public Square (double side) {
        this.side = side;
    }

    public double getPerimetr() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

    public double getSquareSide () {
        return side;
    }

}
