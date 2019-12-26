package HomeWork5;

import java.util.Calendar;
import java.util.Date;

public abstract class Lei {
    int lampCount;

    public boolean getCurrentMinuteState() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return ((int) calendar.get(Calendar.MINUTE)) % 2 == 0 ? true : false;
    }

}
