//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza basePrice = new Pizza(true);
        basePrice.addExtraToppings();
        basePrice.addExtraCheese();
        //basePrice.takeAway();
        basePrice.getBill();
    }
}