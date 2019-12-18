package HomeWork5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        String colour;
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
            leiColour.getState();
            leiBlank.getState();

        } else if (type.equals("blank")) {
            colour = "Blank";
            LeiBlank leiBlank = new LeiBlank(dv.getLeiLength(colour));
            leiBlank.getState();

        } else if (type.equals("color")) {
            colour = "Colour";
            LeiColour leiColour = new LeiColour(dv.getLeiLength(colour));
            leiColour.getState();
        } else {
            System.exit(1);
        }
    }
}
