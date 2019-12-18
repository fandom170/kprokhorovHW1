package HomeWork5;

import java.util.Random;
import java.util.Scanner;

public class DataValidation {
    public int getLeiLength(String colour) {
        int leiLength = 0;
        Boolean validData = true;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the length of the %s garland, please.\n", colour);
        String strLeiLength = sc.nextLine();
        try {
            leiLength = Integer.parseInt(strLeiLength);
        } catch (NumberFormatException e) {
            validData = false;
            e.printStackTrace();
            System.out.println("Wrong value was entered, length will be set randomly from  50 to 100");
        }

        if (!validData) {
            Random r = new Random();
            leiLength = r.nextInt() * 10 + 50;
            System.out.printf("New %s garland length will be set to %d", colour, leiLength);
        }

        return leiLength;
    }


}
