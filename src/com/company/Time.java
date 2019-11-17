package com.company;

public class Time {
    public static final int DEFAULT_SECOND = 0;
    public static final int DEFAULT_MINUTE = 0;
    public static final int DEFAULT_HOUR = 0;

    private int second;
    private int minute;
    private int hour;

    public Time() {
        this.second = DEFAULT_SECOND;
        this.minute = DEFAULT_MINUTE;
        this.hour = DEFAULT_HOUR;
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        // 0 for print 01 etc.
    }

    public void setTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time nextSecond() {
        ++second;

        if(second >= 60) {
            second = 0;
            ++minute;

            if(minute >= 60) {
                minute = 0;
                ++hour;

                if(hour >= 24) {
                    hour = 0;
                }
            }
        }

        return this;
        // return this for cascade e.g. t.nextSecond().nextSecond()
    }
}
