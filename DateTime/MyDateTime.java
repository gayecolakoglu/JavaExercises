public class MyDateTime {
    private MyDate2 date;
    private MyTime time;

    public MyDateTime(MyDate2 date, MyTime time) {
        this.date = date;
        this.time = time;
    }

    public String toString() {
        return date.toString() + " " + time.toString();
    }

    public void incrementDay() {
        date.incrementDay();
    }

    public void incrementHour() {
        int dayDiff = time.incrementHour();
        date.incrementDay(dayDiff);
    }

    public void incrementHour(int value) {
        int dayDiff = time.incrementHour(value);
        date.incrementDay(dayDiff);
    }

    public void decrementHour(int value) {
        int dayDiff = time.incrementHour(-value);
        date.decrementDay(-dayDiff);
    }


    public void incrementMinute(int value) {
        int dayDiff = time.incrementMinute(value);
        date.incrementDay(dayDiff);

    }

    public void decrementMinute(int value) {
        int dayDiff = time.incrementMinute(-value);
        date.incrementDay(-dayDiff);
    }

    public void incrementYear(int value) {

        date.incrementYear(value);
    }

    public void decrementDay() {
        date.decrementDay();
    }

    public void decrementYear() {
        date.decrementYear();
    }

    public void decrementMonth() {
        date.decrementMonth();
    }

    public void incrementDay(int value) {
        date.incrementDay(value);
    }

    public void decrementMonth(int value) {
        date.decrementMonth(value);
    }

    public void decrementDay(int value) {
        date.decrementDay(value);
    }

    public void decrementYear(int value) {
        date.decrementYear(value);
    }

    public void incrementYear() {
        date.incrementYear();
    }

    public void incrementMonth(int value) {
        date.incrementMonth(value);
    }

    public void incrementMonth() {
        date.incrementMonth();
    }

    public boolean isBefore(MyDateTime anotherDateTime) {
        if (this.date.isBefore(anotherDateTime.date)) {
            return true;
        } else if (this.date.isAfter(anotherDateTime.date)) {
            return false;
        } else {
            int thisHour = Integer.parseInt(this.time.toString().replace(":", ""));
            int anotherHour = Integer.parseInt(anotherDateTime.time.toString().replace(":", ""));
            return thisHour < anotherHour;
        }
    }

    public boolean isAfter(MyDateTime anotherDateTime) {
        return !(isBefore(anotherDateTime));
    }

    public String dayTimeDifference(MyDateTime anotherDateTime) {
        int dayDifference = this.date.dayDifference(anotherDateTime.date);
        int minuteDifference = this.time.minuteDifference(anotherDateTime.time);
        dayDifference = date.isAfter(anotherDateTime.date) ? dayDifference : -dayDifference;
        int totalMinDiff = Math.abs(24 * 60 * dayDifference + minuteDifference);
        int day = totalMinDiff / (24 * 60);
        totalMinDiff = totalMinDiff % (24 * 60);
        int hour = totalMinDiff / 60;
        totalMinDiff %= 60;
        int minute = totalMinDiff;
        return ((day > 0 ? day + "day(s) " : "") + (hour > 0 ? hour + "hour(s) " : "" ) + (minute > 0 ? minute + "minute(s) " : ""));
    }
}
