package my.homework.task25;

public class Main {
    static ATM atm;

    public static void main(String[] args) {
        atm = new ATM(3);     //add the number of denominations of banknotes into the ATM
        atm.run();
    }
}







