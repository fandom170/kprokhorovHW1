package HomeWork1;

public class Circle {
        private double radius;

        public Circle (double radius) {
            this.radius = radius;
        }

    public double getArea() {
        //return Double.parseDouble(Constants.df.format(Constants.pi * Math.pow(radius, 2.0) ));
        return Constants.pi * Math.pow(radius, 2.0);
        }

    public double getPerimetr() {
        return Constants.pi * 2 * radius;
        }

        public double getRadius () {
                return radius;
        }
}
