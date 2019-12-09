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
            colourValue += Colours.colors[i % 6];
        } else {
            colourValue = "";

        }
        return colourValue;
    }

}
