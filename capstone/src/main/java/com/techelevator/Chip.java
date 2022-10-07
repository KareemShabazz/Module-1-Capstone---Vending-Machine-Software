package com.techelevator;

public class Chip extends VendingMachineItems{
    public Chip(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);

        Chip potatoCrisps = new Chip("B1","Potato Crisps", 3.05, "Chip");
        Chip stackers = new Chip("B2","Stackers", 1.45, "Chip");
        Chip grainWaves = new Chip("B3","Grain Waves", 2.75, "Chip");
        Chip cloudPopcorn = new Chip("B4","Cloud Popcorn", 3.65, "Chip");

    }
}
