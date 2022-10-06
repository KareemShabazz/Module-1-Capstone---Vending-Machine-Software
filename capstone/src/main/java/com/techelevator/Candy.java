package com.techelevator;

public class Candy extends VendingMachineItems{

    public Candy(String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemName, itemType, itemStock, itemPrice, itemSlot);
    }

    @Override
    public String getMessage(){
        return "Munch, Munch,Yum";
    }
}
