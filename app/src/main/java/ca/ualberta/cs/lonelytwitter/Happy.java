package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends CurrentMood {
    private String mood = "Happy";
    private Date default_date = new Date(1078884319);

    public Happy() {
        super.setDate(default_date);
    }

    public Happy(Date date) {
        super.setDate(date);
    }

    @Override
    public String format() {
        return mood;
    }
}
