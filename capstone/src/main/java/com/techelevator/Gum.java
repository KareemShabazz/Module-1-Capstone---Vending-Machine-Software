package com.techelevator;

public class Gum extends VendingMachineItems{

    public Gum(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);
    }

    @Override
    public String getMessage(){
        return "Chew Chew, Yum!";
    }
}
