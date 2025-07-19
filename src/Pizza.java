public class Pizza {
    private int price;

    private boolean veg;

    private int ExtraCheesePrice = 100;
    private int ExtraToppings = 140;
    private int takeAway = 40;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(boolean veg) {
        this.veg = veg;

        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += ExtraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += ExtraToppings;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += takeAway;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+ExtraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill+= "Extra Toppings Added: "+ ExtraToppings + "\n";
        }
        if(isOptedForTakeAway) {
            bill += "Takeaway: " + takeAway + "\n";
        }

        bill += "Bill: "+ this.price+ "\n";
        System.out.println(bill);
    }
}


/*
 Veg Pizza: 300
 Non Veg Pizza: 400
 Extra Cheese: 100
 Extra Toppings: 140
 Takeaway: 40
 */
