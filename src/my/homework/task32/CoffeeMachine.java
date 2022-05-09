package my.homework.task32;

public class CoffeeMachine extends PowerSupply {
    String name;

    public CoffeeMachine(String name) {
        this.name = name;
    }

    @Override
    public void activeStatus() {
        System.out.println(this.name + " plugged in.");
    }
}
