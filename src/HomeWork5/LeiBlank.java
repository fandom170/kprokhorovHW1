package HomeWork5;

public class LeiBlank extends Lei {
    //private final Boolean colour = false;
    private BulbBlank[] garland;

    public LeiBlank(int lampCount) {
        this.lampCount = lampCount;
        garland = new BulbBlank[lampCount];
        for (int i = 0; i < lampCount; i++) {
            garland[i] = new BulbBlank(i);
        }
    }

    public void getState() {
        String state;
        String ansiColor;
        boolean[] lampState = getCurrentState();

        for (int i = 0; i < garland.length; i++) {
            if (!lampState[i]) {
                state = " is turned off";
            } else {
                state = " is turned on";
            }

            if (lampState.equals(true)) {
                ansiColor = fontColours.ANSI_RESET;
            } else {
                ansiColor = fontColours.ANSI_BLACK;
            }
            System.out.println(ansiColor + "Blank garland lamp #" + garland[i].getNumber() + " is " + state + " now.\n");
        }
    }

}