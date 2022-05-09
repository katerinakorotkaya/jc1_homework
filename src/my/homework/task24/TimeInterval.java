package my.homework.task24;

public class TimeInterval {
    private int second;
    private int minute;
    private int hour;

    public TimeInterval(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public TimeInterval(int seconds) {
        second = seconds;
    }

    public void printSeconds() {
        System.out.println("Seconds in Object1 = " + second);
    }

    public void printSeparatedTime() {
        System.out.println(String.format("Object2 = %s hours, %s minutes, %s seconds", second, minute, hour));
    }

    public int compareTime() {
        if (this.second >= this.returnSeconds()) {
            System.out.println("Object1 >= Object2");
        } else {
            System.out.println("Object1 < Object2");
        }
        return this.second - this.returnSeconds();
    }

    private int returnSeconds() {
        return second + (60 * minute) + (3600 * hour);
    }
}
