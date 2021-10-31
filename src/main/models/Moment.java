package main.models;

public class Moment {
    private int hour;
    private int minute;
    private int seconds;

    public Moment(int hour, int minute, int seconds) {
	super();
	this.hour = hour;
	this.minute = minute;
	this.seconds = seconds;
    }

    public int getHour() {
	return hour;
    }

    public void setHour(int hour) {
	this.hour = hour;
    }

    public int getMinute() {
	return minute;
    }

    public void setMinute(int minute) {
	this.minute = minute;
    }

    public int getSeconds() {
	return seconds;
    }

    public void setSeconds(int seconds) {
	this.seconds = seconds;
    }

}
