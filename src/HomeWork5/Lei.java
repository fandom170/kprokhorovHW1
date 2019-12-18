package HomeWork5;

import java.util.Date;

public abstract class Lei {
    int lampCount;

    Date date = new Date();

    public boolean[] getCurrentState() {
        boolean[] currentLampState = new boolean[lampCount];
        int minutes = (int) (new Date().getTime() / (60 * 1000));
        Boolean odd, even;

        if (minutes % 2 == 0) {
            odd = true;
            even = false;
        } else {
            odd = false;
            even = true;
        }

        for (int i = 0; i < lampCount; i++) {
            if (i % 2 == 0) {
                currentLampState[i] = odd;
            } else {
                currentLampState[i] = even;
            }

        }
        return currentLampState;
    }

    public String GetColorValue(Boolean colour, int i) {
        String colourValue = "bulb colour is ";
        if (colour) {
            colourValue += Colours.colors[i % Colours.colors.length];
        } else {
            colourValue = "";

        }
        return colourValue;
    }

}
