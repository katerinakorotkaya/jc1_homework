package my.homework.task34;


public abstract class Data {
    protected String personName;
    protected String position;
    protected double salary;

    public Data(String personName, String position, double salary) {
        this.personName = personName;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return personName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double paySalary() {
        return 0;
    }
}
