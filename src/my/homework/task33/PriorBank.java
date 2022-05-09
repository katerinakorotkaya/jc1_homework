package my.homework.task33;

class PriorBank extends Card {
    private String bankName;
    private int cardId;
    private int password;
    private double balance;

    public PriorBank(String bankName, int cardId, int password, double balance) {
        this.bankName = bankName;
        this.cardId = cardId;
        this.password = password;
        this.balance = balance;

    }


    @Override
    protected void repBalance(int balance) {
        if (balance < balance) {
            System.out.println("Error. Insufficient funds.");
        }
        this.balance += balance;
        System.out.println("Your balance in PriorBank card is USD " + this.balance);

    }

    @Override
    protected void withdrawCash(int balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
            System.out.println("Your balance after operation is USD " + this.balance);

        }
    }
}
