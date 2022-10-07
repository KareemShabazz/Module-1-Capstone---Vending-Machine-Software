package com.techelevator;

public class Drinks extends VendingMachineItems {
    public Drinks(String itemCode,String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemCode, itemName, itemType, itemStock, itemPrice, itemSlot);
    }

        @Override
        public String getMessage(){
            return "Glug Glug, Yum";
    }
}
