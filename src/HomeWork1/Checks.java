package HomeWork1;

public class Checks {

    public static String geometryCheck (Circle circle, Square square) {
        String string;
        double diameter = circle.getRadius() * 2.0;
        double side = square.getSquareSide();
        double diagonal = side * Math.sqrt(2.0);

        if (side > diameter) {
            string = "Circle is fully inside square";
        } else if (side == diameter) {
            string = "Circle touches edges of square.";
        } else if (side < diameter && diagonal > diameter) {
            string = "Circle crosses sides of square";
        } else if (diagonal == diameter) {
            string = "Corners of square touches circle line";
        } else {
            string = "Square is fully inside circle";
        }

        return string;
    }
}
