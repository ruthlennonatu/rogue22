// L00156020 - Jamie McGee

import java.io.Serializable;

public class Date {
    // Unecessary implementation for this demonstration.
    // implements Serializable {

    private int day = 0;
    private int month = 0;
    private int year = 0;

    public Date() {
        // System.out.println("Date object called successfully!");
        day = 1;
        month = 1;
        year = 1900;
    }

    public Date(int d, int m, int y) throws IllegalArgumentException {
        System.out.println("Date object called successfully!");
        if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1900 || y > 2023) {
            throw new IllegalArgumentException("Invalid Date..");
        } else {
            day = d;
            month = m;
            year = y;
        }
    }

    @Override
    public String toString() {
        return "Day: " + day + ", Month: " + month + ", Year: " + year;
    }

    @Override
    public boolean equals(Object obj) {
        Date dObject;
        if (obj instanceof Date)
            dObject = (Date) obj;
        else
            return false;

        return (((this.day == dObject.day) && this.month == dObject.month) && this.year == dObject.year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int d) throws IllegalArgumentException {
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("Invalid day..");
        } else {
            this.day = d;
        }
    }

    public void setMonth(int m) throws IllegalArgumentException {
        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("Invalid month..");
        } else {
            this.month = m;
        }
    }

    public void setYear(int y) throws IllegalArgumentException {
        if (y < 1900 || y > 2023) {
            throw new IllegalArgumentException("Invalid year..");
        } else {
            this.year = y;
        }
    }

}