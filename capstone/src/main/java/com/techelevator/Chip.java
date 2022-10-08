package com.techelevator;

public class Chip extends VendingMachineItems{
    public Chip(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode,itemName,itemPrice,itemType,"Crunch, Crunch, Yum");

    }

    public void getMessage(){
        System.out.println("Crunch, Crunch, Yum");
    }

}

