package com.techelevator;

<<<<<<< HEAD
import java.lang.reflect.Type;

public class Drink extends VendingMachineItems {
    public Drink(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);

        Drink cola = new Drink("C1", "Cola", 1.25, "Drink");
        Drink drSalt = new Drink("C2", "Dr. Salt", 1.50, "Drink");
        Drink mountainMelter = new Drink("C3", "Mountain Melter", 1.50, "Drink");
        Drink heavy = new Drink("C4", "Heavy", 1.50, "Drink");
=======
public class Drink extends VendingMachineItems {

    public Drink(String itemCode, String itemName, double itemPrice, String itemType) {
        super(itemCode, itemName, itemPrice, itemType);
>>>>>>> 6434d480056d2925032fde168d70487bb7dca16c
    }

        @Override
        public String getMessage(){
            return "Glug Glug, Yum";
    }
}
