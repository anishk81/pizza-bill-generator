public class DeluxePizza extends Pizza{
    public DeluxePizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraToppings() {
    }

    @Override
    public void addExtraCheese() {
    }
}
