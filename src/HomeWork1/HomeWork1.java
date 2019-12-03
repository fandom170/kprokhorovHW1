package HomeWork1;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = 0;
        double radius = 0;
        String data1;
        String data2;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter square side, please");
            data1 = sc.nextLine();
            System.out.println("Enter radius, please");
            data2 = sc.nextLine();
            //side = Double.valueOf(data1);
            //radius = Double.parseDouble(data2);
            try {
                side = DecimalFormat.getNumberInstance().parse(data1).doubleValue();
                radius = DecimalFormat.getNumberInstance().parse(data2).doubleValue();
            }
            catch (ParseException e) {
                continue;
            }
            break;
        }

        sc.close();

        if (side <= 0 || radius <= 0) {
            System.out.println("Wrong or zero data was entered. Previously entered values will be ignored");
            System.out.println("New random values will be generated");
            //Random r = new Random();
            radius = Math.random()*(5.0 - 0.5) + 0.5;
            side = Math.random()*(5.0 - 0.5) + 0.5;
        }
        Square sq = new Square(radius);
        Circle cir = new Circle(side);

        System.out.printf("Square side is %.2f\n", side);
        System.out.printf("radius is %.2f\n", radius);
        System.out.println(sq.getSquare());
        System.out.println(cir.getSquare());
        System.out.println(Checks.geometryCheck(radius, side));

    }

}
