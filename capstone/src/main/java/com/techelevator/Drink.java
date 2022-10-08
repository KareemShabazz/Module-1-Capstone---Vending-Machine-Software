package com.techelevator;

import java.lang.reflect.Type;

public class Drink extends VendingMachineItems {
    public Drink(String itemCode, String itemName, double itemPrice, String itemType) {
    super(itemCode,itemName,itemPrice,itemType,"Glug, Glug, Yum");

}

    public void getMessage(){
        System.out.println("Glug, Glug, Yum");
    }

}

