package com.techelevator;

public class Chips extends VendingMachineItems{
    private String code;


    public Chips(String itemName, String itemType, int itemStock, double itemPrice, String itemSlot) {
        super(itemName, itemType, itemStock, itemPrice, itemSlot);
    }

   // public Chip(String code, String itemName, double itemPrice, String itemType){

  //  }

    @Override
    public String getMessage(){
        return "Crunch Crunch, Yum!";
    }
}
