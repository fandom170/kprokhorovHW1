package HomeWork1;

public class Checks {
    public static String geometryCheck (double radius, double side) {
        String string;
        double diag = Math.pow(side, 0.5);
        if (2 * radius > diag) {
            string = "Square is drown inside the circle";
        }
        else if (2 * radius == diag) {
            string = "Circle is inscribed around square";
        }
        else {
            string = "Diagonal of square is greater than circle diameter";
        }
        return string;
    }

    public static String geometryCheck (Circle circle, Square square) {
        String string;

        double diag = Math.pow(square.getSquareSide(), 0.5);
        if (2 * circle.getRadius() > diag) {
            string = "Square is drown inside the circle";
        }
        else if (2 * circle.getRadius() == diag) {
            string = "Circle is inscribed around square";
        }
        else {
            string = "Diagonal of square is greater than circle diameter";
        }
        return string;
    }
}
