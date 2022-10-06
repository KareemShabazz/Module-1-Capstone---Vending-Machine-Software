package com.techelevator;

public class Chips extends VendingMachineItems{

    public Chips(String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemName, itemType, itemStock, itemPrice, itemSlot);
    }

    @Override
    public String getMessage(){
        return "Crunch Crunch, Yum!";
    }
}
