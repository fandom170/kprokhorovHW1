package HomeWork5;

public class LeiBlank extends Lei {
    private BulbBlank[] garland;

    public LeiBlank(int lampCount) {
        this.lampCount = lampCount;
        garland = new BulbBlank[lampCount];
        for (int i = 0; i < lampCount; i++) {
            garland[i] = new BulbBlank();
        }
    }

    public void getState() {
        String state;
        String ansiColor;
        boolean minute = getCurrentMinuteState();

        for (int i = 0; i < garland.length; i++) {
            if (!minute) {
                state = i % 2 == 0 ? " is turned off" : " is turned on";
            } else {
                state = i % 2 == 0 ? " is turned on" : " is turned off";
            }

            if (state.equals(" is turned on")) {
                ansiColor = fontColours.ANSI_BLACK;
            } else {
                ansiColor = fontColours.ANSI_RESET;
            }
            System.out.printf(ansiColor + "Blank garland lamp #%d is %s now.\n", (i + 1), state);
        }
    }

}