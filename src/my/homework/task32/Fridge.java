package my.homework.task32;

public class Fridge extends PowerSupply {
    String name;

    public Fridge(String name) {
        this.name = name;
    }

    @Override
    public void activeStatus() {

        System.out.println(this.name + " plugged in");
    }
}
