package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood {
    private Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String format();
}
