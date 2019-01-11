package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends CurrentMood {
    private String mood = "Sad";
    private Date default_date = new Date(1078884319);

    public Sad() {
        setDate(default_date);
    }

    public Sad(Date date) {
        setDate(date);
    }

    @Override
    public String format() {
        return mood;
    }
}
