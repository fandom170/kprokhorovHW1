package HomeWork1;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class DataValidations {

    public double GetValue(String shape) {

        Scanner sc = new Scanner(System.in);
        double parameter = 0;
        String description = "";

        switch (shape) {
            case "Circle":
                description = "radius of circle";
                break;
            case "Square":
                description = "side of square";
                break;
            default:
                description = "unknown parameter";
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter %s, please.\n", description);
            String enteredData = sc.nextLine();
            try {
                parameter = DecimalFormat.getNumberInstance().parse(enteredData).doubleValue();
            } catch (ParseException e) {
                System.out.println("Incorrect parameter was entered.\n Try enter again, please");
                continue;
            }

            if (parameter <= 0 && i < 2) {
                System.out.printf("Wrong, negative or zero value of %s was entered.\n", description);
                System.out.println("Try again, please.");
                continue;
            }
            break;
        }

        if (parameter <= 0) {
            System.out.printf("Wrong, negative or zero value of %s was entered in several attempts.\n", description);
            System.out.println("New random value will be generated");
            parameter = Math.random() * (5.0 - 0.5) + 0.5;
            System.out.printf("New %s value is %.2f.\n", description, parameter);
        }
        return parameter;
    }
}
