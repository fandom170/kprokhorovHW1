package HomeWork1;

public class Square {
    private double side;

    public Square (double side) {
        this.side = side;
    }

    public double getPerim() {
        return Math.round(4 * side * 100d)/100d;
    }

    public double getSquare() {
        return Math.round(side * side * 100d)/100d;
    }

    public double getSquareSide () {
        return side;
    }
}
