package HomeWork5;

import java.util.Date;

public abstract class Lei {
    int lampCount;

    Date date = new Date();


    public String currentState(boolean colour) {
        String state = "";
        Boolean odds = true;
        String lampStateOdd;
        String lampStateEven;
        String colourValue;
        int multiplier = (int) (date.getTime()) % 10;


        if (multiplier % 2 == 0) {
            lampStateOdd = "Enabled";
            lampStateEven = "Disabled";
        } else {
            lampStateOdd = "Enabled";
            lampStateEven = "Disabled";
        }

        for (int i = 0; i < lampCount; i++) {
            colourValue = getColourVaslue(colour, i);
            if (i % 2 == 0) {
                state += "Lamp No" + i + " " + lampStateOdd + colourValue;
            } else {
                state += "Lamp No" + i + " " + lampStateEven + colourValue;
            }

        }
        return state;
    }

    public String getColourVaslue(Boolean colour, int i) {
        String colourValue = "bulb colour is ";
        if (colour) {
            switch (i % 4) {
                case 0:
                    colourValue += Colours.colours.RED.toString();
                    break;
                case 1:
                    colourValue += Colours.colours.YELLOW.toString();
                    break;
                case 2:
                    colourValue += Colours.colours.GREEN.toString();
                    break;
                default:
                    colourValue += Colours.colours.BLUE.toString();
            }

        } else {
            colourValue = "";

        }
        return colourValue;
    }

}
