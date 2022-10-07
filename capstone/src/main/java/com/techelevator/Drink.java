package com.techelevator;

public class Drink extends VendingMachineItems {

    public Drink(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);
    }

        @Override
        public String getMessage(){
            return "Glug Glug, Yum";
    }
}
