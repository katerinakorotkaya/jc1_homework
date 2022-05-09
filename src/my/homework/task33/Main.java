package my.homework.task33;

public class Main {
    public static void main(String[] args) {
        Card card1 = new AlfaBank("Alfa-Bank ",5995-1584-4854-4584,2233,1000.00);
        card1.repBalance(800);
        card1.withdrawCash(20);

        Card card2 = new PriorBank("Prior Bank ",3455-7777-9854-3569,6485,500.00);
        card2.repBalance(45);
        card2.withdrawCash(300);

        Card card3 = new BelarusBank("Belarusbank",3544-8964-6521-1881,1324,10_000.00);
        card3.repBalance(4000);
        card3.withdrawCash(4000);

    }
}
