package my.homework.task32;

public class Main {
    public static void main(String[] args) {
        PowerSupply ps1 = new DishWasher("The Dishwasher");
        ps1.activeStatus();

        PowerSupply ps2 = new Fridge("The Fridge");
        ps2.activeStatus();

        PowerSupply ps3 = new CoffeeMachine("The Coffeemachine");
        ps3.activeStatus();

    }
}
