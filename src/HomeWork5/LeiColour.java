package HomeWork5;

public class LeiColour extends Lei {
    private BulbColour[] garland;

    public LeiColour(int lampCount) {
        this.lampCount = lampCount;
        garland = new BulbColour[lampCount];
        for (int i = 0; i < lampCount; i++) {
            String colour = Colours.colors[i % (Colours.colors.length - 1)];
            garland[i] = new BulbColour(colour);
        }
    }

    public void getState() {
        String lampState = "";
        String ansiColor;
        boolean minute = getCurrentMinuteState();

        for (int i = 0; i < garland.length; i++) {
            if (minute) {
                lampState = i % 2 == 0 ? "turned off" : "turned on";
                ;
            } else {
                lampState = i % 2 == 0 ? "turned on" : "turned off";
                ;
                ;
            }
            ansiColor = getAnsiColor(i, lampState);
            System.out.printf(ansiColor + "Color garland lamp #%d is %s and %s now.\n", (i + 1), garland[i].getBulbColor(), lampState);
        }
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
            ansiColor = fontColours.ANSI_WHITE;
            /*switch (garland[i].getBulbColor()) {
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
            }*/
        }

        return ansiColor;

    }

}
