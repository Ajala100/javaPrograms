package chapterThree;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        if(year > 2021)
            throw new IllegalArgumentException("Year cannot be above 2021");
        else{ this.year = year;}
        if (month < 0 || month> 12)
            throw new IllegalArgumentException("invalid month selection");
        else{this.month = month;}
        if(day < 0 || day > 31)
            throw new IllegalArgumentException("invalid day selection");
        else{this.day = day;}
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void displayDate(){
        System.out.printf("%s%d%s%d%s%d%n", "The date is: ", getMonth(), "/", getDay(), "/", getYear());
    }
}
