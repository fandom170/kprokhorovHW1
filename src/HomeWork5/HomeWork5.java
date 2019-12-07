package HomeWork5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        String strBlankLen;
        String strColourLen;
        int blankLength = 0;
        int colourLength = 0;
        Boolean validData = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of single tone garland, please");
        strBlankLen = sc.nextLine();
        System.out.println("Enter the length of colour garland, please");
        strColourLen = sc.nextLine();

        try {
            blankLength = Integer.parseInt(strBlankLen);
            colourLength = Integer.parseInt(strColourLen);
        } catch (InputMismatchException e) {
            validData = false;
            System.out.println("Wrong values were entered, length will be set randomly from  50 to 100");
        }

        if (!validData) {
            Random r = new Random();
            blankLength = r.nextInt() * 10 + 50;
            colourLength = r.nextInt() * 10 + 50;
        }

        LeiColour lc = new LeiColour(colourLength);
        LeiBlank lb = new LeiBlank(blankLength);

    }
}
