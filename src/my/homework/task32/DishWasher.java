package my.homework.task32;

public class DishWasher extends PowerSupply {
    String name;

    public DishWasher(String name) {
        this.name = name;
    }

    @Override
    public void activeStatus() {
        System.out.println(this.name + " plugged in.");
    }
}

