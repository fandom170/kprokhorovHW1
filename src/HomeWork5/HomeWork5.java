package HomeWork5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        String colour;
        String leiState;
        String type;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter desired garland type (Color/Blank) or word \"Both\" if you need to see both variants");
        System.out.println("Entering of any other value will lead to stop  of program execution");
        DataValidation dv = new DataValidation();
        type = sc.nextLine().toLowerCase();

        if (type.equals("both")) {
            colour = "Colour";
            LeiColour leiColour = new LeiColour(dv.getLeiLength(colour));
            colour = "Blank";
            LeiBlank leiBlank = new LeiBlank(dv.getLeiLength(colour));

            leiState = leiColour.getState();
            System.out.println(leiState);

            leiState = leiBlank.getState();
            System.out.println(leiState);

        } else if (type.equals("blank")) {
            colour = "Blank";
            LeiBlank leiBlank = new LeiBlank(dv.getLeiLength(colour));
            leiState = leiBlank.getState();
            System.out.println(leiState);
        } else if (type.equals("color")) {
            colour = "Colour";
            LeiColour leiColour = new LeiColour(dv.getLeiLength(colour));
            leiState = leiColour.getState();
            System.out.println(leiState);
        } else {
            System.exit(1);
        }



    }
}
