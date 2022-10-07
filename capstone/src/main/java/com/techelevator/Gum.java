package com.techelevator;

public class Gum extends VendingMachineItems{

    public Gum(String itemCode, String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemCode, itemName, itemType, itemStock, itemPrice, itemSlot);
    }

    @Override
    public String getMessage(){
        return "Chew Chew, Yum!";
    }
}
