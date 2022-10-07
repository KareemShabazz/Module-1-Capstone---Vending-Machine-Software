package com.techelevator;

public class Candy extends VendingMachineItems{

    public Candy(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);

        Candy moonPie = new Candy("B1","MoonPie", 1.80, "Candy");
        Candy cowtales = new Candy("B2","Cowtales", 1.50, "Candy");
        Candy wonkaBar = new Candy("B3","WonkaBar", 1.50, "Candy");
        Candy crunchie = new Candy("B4","Crunchie", 1.75, "Candy");

    }

    @Override
    public String getMessage(){
        return "Munch, Munch,Yum";
    }
}
