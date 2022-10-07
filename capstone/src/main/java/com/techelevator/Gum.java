package com.techelevator;

public class Gum extends VendingMachineItems{

    public Gum(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);

        Gum uChews = new Gum("D1", "U-Chews", 0.85, "Gum");
        Gum littleLeague = new Gum("D2", "Little League", 0.95, "Gum");
        Gum chiclets = new Gum("D3", "Chiclets", 0.75, "Gum");
        Gum triplemint = new Gum("D4", "Triplemint", 0.75, "Gum");


    }



    @Override
    public String getMessage(){
        return "Chew Chew, Yum!";
    }
}
