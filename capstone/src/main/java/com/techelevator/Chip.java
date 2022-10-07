package com.techelevator;

public class Chip extends VendingMachineItems{
    private String itemCode;


    public Chip(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);
    }


   // public Chip(String code, String itemName, double itemPrice, String itemType){

  //  }

    @Override
    public String getMessage(){
        return "Crunch Crunch, Yum!";
    }
}
