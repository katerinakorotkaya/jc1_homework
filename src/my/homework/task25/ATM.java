package my.homework.task25;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import static my.homework.task25.Main.atm;

class ATM {
    private final Money[] m;
    private final int[] nam = new int[]{20, 50, 100};

    public ATM(int n) {
        m = new Money[nam.length];
        Random r = new Random();//для автозаполнения банкомата
        for (int i = 0; i < n; i++) {
            m[i] = new Money(nam[i], r.nextInt(100) + 1);//заполняем банкомат
        }
    }

    public void setMoney() {
        System.out.println("Attention! ATM replenishment in progress. ");
        Scanner sca = new Scanner(System.in);
        for (int i = 0; i < nam.length; i++) {
            System.out.println("Please, enter the number of denominations BYN " + nam[i] + ": ");
            int n = Integer.parseInt(sca.nextLine());
            if (m[i] != null) {
                m[i].addMoney(n);
            } else {
                m[i] = new Money(nam[i], n);
            }
        }
        sca.close();
    }

    public void getMoney() {
        System.out.print("Attention, banknotes of the following denominations remained in thr ATM: ");
        printNam();
        System.out.println("\nPlease, enter the sum.");
        Scanner scan = new Scanner(System.in);
        int sum = Integer.parseInt(scan.nextLine());
        scan.close();
        System.out.println(!exam(sum) ? "Attention! The operation was failed\n\n" : "\n\n");
    }

    private void printNam() {
        IntStream.range(0, m.length).filter(i -> m[i] != null && m[i].isMoney()).mapToObj(i -> m[i].getNominal()
                + ", ").forEach(System.out::print);
    }

    private boolean exam(int suma) {
        ArrayList<Loc> l = new ArrayList<Loc>();
        if (suma % 10 != 0) {
            return false;
        } else {
            int i = m.length - 1;
            while (i >= 0) {
                if (null != m[i]) {               //check for money
                    int request = suma % m[i].getNominal();
                    if (m[i].moneyIsOk(request)) {
                        l.add(new Loc(i, request));
                        suma -= request * m[i].getNominal();
                    }
                    if (suma == 0) {
                        break;
                    }
                }
                i++;
            }
            if (suma != 0) {
                return false;
            } else {                            //ATM gives money
                System.out.println("Please, take the banknotes:");
                for (Loc loc : l) {
                    m[loc.position].getMoney(loc.n);
                }
                return true;
            }
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an action: " + "\n" +
                "1. Deposit" + "\n" + "2. Withdraw" + "\n" + "0. Exit");
        while (true) {
            try {
                int code = Integer.parseInt(scanner.nextLine());
                if (code == 0) {
                    break;
                } else if (code == 1) atm.setMoney();
                else if (code == 2) atm.getMoney();
                else {
                    System.err.println("Sorry, unknown operation.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error! Please, try again. ");
            }
        }
        scanner.close();
    }
}

