package HomeWork1;

public class Circle {
        private double radius;

        public Circle (double radius) {
            this.radius = radius;
        }

        public double getSquare () {
                return Double.parseDouble(Constants.df.format(Constants.pi * Math.pow(radius, 2.0) ));
        }

        public double getPerim() {
                return Math.round(Constants.pi * 2 * radius*100d)/100d;
        }

        public double getRadius () {
                return radius;
        }
}
