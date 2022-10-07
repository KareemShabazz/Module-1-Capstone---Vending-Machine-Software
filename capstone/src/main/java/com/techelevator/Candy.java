package com.techelevator;

public class Candy extends VendingMachineItems{

    public Candy(String itemCode, String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemCode, itemName, itemType, itemStock, itemPrice, itemSlot);
    }

    @Override
    public String getMessage(){
        return "Munch, Munch,Yum";
    }
}
