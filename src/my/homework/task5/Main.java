package my.homework.task5;

public class Main {
    public static void main(String[] args) {
        long s = 864830L;
        long sec = s % 60L;
        long m = (s - sec) / 60L;
        long min = m % 60L;
        long h = (m - min) / 60L;
        long d = s / 86400L;
        long w = d / 7L;
        System.out.println(h + " hour(s) " + min + " minute(s) " + sec + " second(s), " + d + " day(s) and " + w + " week(s)");
    }
}
