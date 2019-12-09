package HomeWork5;

import java.util.Date;

public class LeiBlank extends Lei {
    private final Boolean colour = false;
    private BulbBlank[] garland;

    public LeiBlank(int lampCount) {
        this.lampCount = lampCount;
        garland = new BulbBlank[lampCount];
        for (int i = 0; i < lampCount; i++) {
            garland[i] = new BulbBlank(i);
        }
    }

    public String getState() {
        String state = "";
        String lampState = "";
        int minutes = (int) (new Date().getTime() / (60 * 1000));
        String odd;
        String even;
        String ansiColor;

        if (minutes % 2 == 0) {
            odd = "turned off";
            even = "turned on";
        } else {
            odd = "turned on";
            even = "turned off";
        }

        for (int i = 0; i < garland.length; i++) {
            if (garland[i].getNumber() % 2 == 0) {
                lampState = odd;
            } else {
                lampState = even;
            }

            if (lampState.equals("turned on")) {
                ansiColor = fontColours.ANSI_RESET;
            } else {
                ansiColor = fontColours.ANSI_BLACK;
            }
            state += "Blank garland lamp #" + garland[i].getNumber() + " is " + lampState + " now.\n" + ansiColor;
        }

        return state;

    }

    public Boolean getGarlandType() {
        return colour;
    }
}