package homework_nr_6;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
            return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else
            //throw new IllegalArgumentException("Invalid Day!");
        {
            System.out.println("Invalid day!");
            System.exit(0);
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else
            //throw new IllegalArgumentException("Invalid Month!");
        {
            System.out.println("Invalid month!");
            System.exit(0);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else
            //throw new IllegalArgumentException("Invalid Year!");
        {
            System.out.println("Invalid year!");
            System.exit(0);
        }
    }

    public void displayDate(){
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }
}
