package my.homework.task34;

public class Engineer extends Data {
    int hour = 8;
    double fullDaySalary = hour * 220;

    public Engineer(String personName, String position, double salary) {
        super(personName, position, salary);
    }

    @Override
    public double paySalary() {
        return fullDaySalary;
    }
}
