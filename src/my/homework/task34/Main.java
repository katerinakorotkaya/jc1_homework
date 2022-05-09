package my.homework.task34;

public class Main {
    public static void main(String[] args) {
        System.out.println("Job structure on the factory (including name and salary of every worker): ");
        System.out.println();
        Engineer data1 = new Engineer("Yemeliyanov","Engineer",1760.00);
        System.out.println("1." + data1.getName() + " is the " + data1.getPosition() + " and his salary is BYN " + data1.getSalary());
        Welder data2 = new Welder("Ivanov","Welder",1080.00);
        System.out.println("2." + data2.getName() + " is the " + data2.getPosition() + " and his salary is BYN " + data2.paySalary());
        Accountant data3 = new Accountant("Vishnevskaya","Accountant",1806.60);
        System.out.println("3." + data3.getName() + " is the " + data3.getPosition() + " and her salary is BYN " + data3.paySalary());
    }
}
