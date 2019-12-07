package HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        String shape;
        DataValidations dt = new DataValidations();
        shape = "Square";
        Square square = new Square(dt.GetValue(shape));
        shape = "Circle";
        Circle circle = new Circle(dt.GetValue(shape));

        System.out.printf("Square side is %.2f\n", square.getSquareSide());
        System.out.printf("radius is %.2f\n", circle.getRadius());
        System.out.printf("Area of square is %.2f.\n", square.getArea());
        System.out.printf("Area of circle is %.2f.\n", circle.getArea());
        System.out.println(Checks.geometryCheck(circle, square));

    }

}
