package my.homework.task24;

public class Main {
    public static void main(String[] args) {
        TimeInterval object1 = new TimeInterval(3600);
        TimeInterval object2 = new TimeInterval(3,30,00);
        object1.printSeconds();
        object2.printSeparatedTime();
        object2.compareTime();

    }
}
