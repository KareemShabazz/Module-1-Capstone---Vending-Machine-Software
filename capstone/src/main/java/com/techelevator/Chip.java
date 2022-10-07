package com.techelevator;

public class Chip extends VendingMachineItems{

    public Chip(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice ,itemType);
    }

    Chip potatoCrisps = new Chip("A1","Potato Crisps", 3.05, "Chip");
    Chip Stackers = new Chip("A2","Stackers", 1.45, "Chip");
    Chip grainWaves = new Chip("A3","Grain Waves", 2.75, "Chip");
    Chip cloudPopcorn = new Chip("A4","Cloud Popcorn", 3.65, "Chip");


  //  }

    @Override
    public String getMessage(){
        return "Crunch Crunch, Yum!";
    }
}
