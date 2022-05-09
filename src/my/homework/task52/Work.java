package my.homework.task52;

import java.util.ArrayList;

public class Work implements Runnable {

    class Main {
        public void main(String[] args) throws InterruptedException {
            Thread thread1 = new Thread(new Work());
            thread1.start();
            Thread.sleep(3000);

            Thread thread2 = new Thread(new Work());
            thread2.start();
            Thread.sleep(3000);

            Thread thread3 = new Thread(new Work());
            thread3.start();
            Thread.sleep(3000);

            Thread thread4 = new Thread(new Work());
            thread4.start();
            Thread.sleep(2500);

            Thread thread5 = new Thread(new Work());
            thread5.start();
            Thread.sleep(2500);

            Thread thread6 = new Thread(new Work());
            thread6.start();
            Thread.sleep(3000);

            Thread thread7 = new Thread(new Work());
            thread7.start();
            Thread.sleep(1500);

            Thread thread8 = new Thread(new Work());
            thread8.start();
            Thread.sleep(3000);

            Thread thread9 = new Thread(new Work());
            thread9.start();
            Thread.sleep(2500);

            Thread thread10 = new Thread(new Work());
            thread10.start();
            Thread.sleep(2000);
        }
    }

    @Override
    public void run() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < Math.random() * 10; i++) {
            arrayList.add(i);
        }


        System.out.println(average(arrayList));
    }

    static double average(ArrayList<Integer> arrayList) {
        double sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum / arrayList.size();
    }
}
