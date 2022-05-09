package my.homework.task34;

public class Welder extends Data {
    float byTheDay = 20.00f * 40;
    float payForHour = 7.00f;
    float hourly = payForHour * 40;
    float totalPayment = hourly + byTheDay;

    public Welder(String personName, String position, double salary) {
        super(personName, position, salary);
    }

    @Override
    public double paySalary() {
        return totalPayment;
    }
}