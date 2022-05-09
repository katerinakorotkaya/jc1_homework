package my.homework.task34;

public class Accountant extends Data {
    double dayContract = 90.50;
    int x = 20;
    int tax = 14;
    double contractPay = dayContract * x;
    double per = (contractPay / 100) * 14;
    double totalCP = contractPay - per;

    public Accountant(String personName, String position, double salary) {
        super(personName, position, salary);
    }

    @Override
    public double paySalary() {
        return totalCP;
    }
}