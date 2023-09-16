package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrize;
    private int paperBagPrice;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.toppingsPrize = 70;
        } else {
            this.price = 400;
            this.toppingsPrize = 120;
        }
        this.cheesePrice = 80;
        this.paperBagPrice = 20;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            price += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            price += toppingsPrize;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded) {
            price += paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            if(isCheeseAdded) {
                bill = bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
            }
            if(isToppingsAdded) {
                bill = bill + "Extra Toppings Added: " + this.toppingsPrize + "\n";
            }
            if(isPaperBagAdded) {
                bill = bill + "Paperbag Added: " + this.paperBagPrice + "\n";
            }
            bill = bill + "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
