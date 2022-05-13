package my.homework.task25;

public class Money {
    private final int nominal;
    private int n;

    public Money(int nom, int n) {
        nominal = nom;
        this.n = n;
    }

    void addMoney(int n) {
        this.n += n;
    }

    boolean isMoney() {
        return n > 0;
    }

    int getNominal() {
        return nominal;
    }

    boolean moneyIsOk(int request) {
        return request <= n;
    }

    void getMoney(int n) {
        this.n -= n;
        System.out.println(nominal + "BYN = " + n);
    }
}
