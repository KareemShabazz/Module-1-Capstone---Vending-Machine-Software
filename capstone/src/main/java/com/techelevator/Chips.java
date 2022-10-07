package com.techelevator;

public class Chips extends VendingMachineItems{
    private String itemCode;


    public Chips(String itemCode, String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemCode, itemName, itemType, itemStock, itemPrice, itemSlot);
    }

   // public Chip(String code, String itemName, double itemPrice, String itemType){

  //  }

    @Override
    public String getMessage(){
        return "Crunch Crunch, Yum!";
    }
}
