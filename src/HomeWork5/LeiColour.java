package HomeWork5;

import java.util.Date;

public class LeiColour extends Lei {
    private final Boolean colour = true;
    private BulbColour[] garland;

    public LeiColour(int lampCount) {
        this.lampCount = lampCount;
        garland = new BulbColour[lampCount];
        for (int i = 0; i < lampCount; i++) {
            String colour = Colours.colors[i % (Colours.colors.length - 1)];
            garland[i] = new BulbColour(i, colour);
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
            ansiColor = getAnsiColor(i, lampState);
            state += ansiColor + "Color garland lamp #" + (garland[i].getNumber() + 1) + " is " +
                    garland[i].getBulbColor() + " and " + lampState + " now.\n";
        }

        return state;
    }

    public String getAnsiColor(int i, String lampState) {
        String ansiColor;
        if (lampState.equals("turned on")) {
            switch (garland[i].getBulbColor()) {
                case "RED":
                    ansiColor = fontColours.ANSI_BRIGHT_RED;
                    break;
                case "YELLOW":
                    ansiColor = fontColours.ANSI_BRIGHT_YELLOW;
                    break;
                case "GREEN":
                    ansiColor = fontColours.ANSI_BRIGHT_GREEN;
                    break;
                case "BLUE":
                    ansiColor = fontColours.ANSI_BRIGHT_BLUE;
                    break;
                case "PURPLE":
                    ansiColor = fontColours.ANSI_BRIGHT_PURPLE;
                    break;
                case "CYAN":
                    ansiColor = fontColours.ANSI_BRIGHT_CYAN;
                    break;
                default:
                    ansiColor = fontColours.ANSI_BRIGHT_BLACK;
            }
        } else {
            switch (garland[i].getBulbColor()) {
                case "RED":
                    ansiColor = fontColours.ANSI_RED;
                    break;
                case "YELLOW":
                    ansiColor = fontColours.ANSI_YELLOW;
                    break;
                case "GREEN":
                    ansiColor = fontColours.ANSI_GREEN;
                    break;
                case "BLUE":
                    ansiColor = fontColours.ANSI_BLUE;
                    break;
                case "PURPLE":
                    ansiColor = fontColours.ANSI_PURPLE;
                    break;
                case "CYAN":
                    ansiColor = fontColours.ANSI_CYAN;
                    break;
                default:
                    ansiColor = fontColours.ANSI_WHITE;
            }
        }

        return ansiColor;

    }

    public Boolean getGarlandType() {
        return colour;
    }
}
