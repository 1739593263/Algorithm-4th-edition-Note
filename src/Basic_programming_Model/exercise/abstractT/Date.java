package Basic_programming_Model.exercise.abstractT;

abstract class Date {
    private final int month;
    private final int day;
    private final int year;

    protected Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    protected int month(){
        return month;
    }

    protected int day(){
        return day;
    }

    protected int year(){
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month() +
                ", day=" + day() +
                ", year=" + year() +
                '}';
    }
}
