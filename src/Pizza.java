public class Pizza {
    private int price;

    private boolean veg;

    private int ExtraCheesePrice = 100;
    private int ExtraToppings = 140;
    private int takeAway = 40;




    public Pizza(boolean veg) {
        this.veg = veg;

        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public void addExtraCheese(){
        System.out.println("Extra Cheese added");
        this.price += ExtraCheesePrice;
    }

    public void addExtraToppings(){
        System.out.println("Extra toppings added of olives, capsicum and onion");
        this.price += ExtraToppings;
    }

    public void takeAway(){
        System.out.println("A carry away backpack added for you convenience");
        this.price += takeAway;
    }

    public void getBill(){
        System.out.println(this.price);
    }
}


/*
 Veg Pizza: 300
 Non Veg Pizza: 400
 Extra Cheese: 100
 Extra Toppings: 140
 Takeaway: 40
 */
