package com.techelevator;

public class beverages extends VendingMachineItems {
    public beverages(String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemName, itemType, itemStock, itemPrice, itemSlot);
    }

        @Override
        public String getMessage(){
            return "Glug Glug, Yum";
    }
}
