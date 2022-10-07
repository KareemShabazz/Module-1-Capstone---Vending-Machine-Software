package com.techelevator;

public class Candy extends VendingMachineItems{

    public Candy(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);
    }

    @Override
    public String getMessage(){
        return "Munch, Munch,Yum";
    }
}
