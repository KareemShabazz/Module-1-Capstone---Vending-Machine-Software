package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineItems {

    private String itemCode;
    private String itemName;
    private String itemType;
    private int itemStock = 5;
    private double itemPrice;
    private String message;

//Constructor
<<<<<<< HEAD
    public VendingMachineItems(String itemCode, String itemName, double itemPrice, String itemType){
=======


    public VendingMachineItems(String itemCode, String itemName, double itemPrice, String itemType ){
>>>>>>> 6434d480056d2925032fde168d70487bb7dca16c
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemStock = itemStock;
        this.itemPrice = itemPrice;


    }

//getters and setters


    public String getItemCode() {return itemCode;}

    public String getItemName(){
        return this.itemName;
    }

    public String getItemType(){
        return this.itemType;
    }

    public int getItemStock(){
        return this.itemStock;
    }

    public double getItemPrice(){
        return this.itemPrice;
    }

     //Setters

    public void setItemCode(String itemCode) {this.itemCode = itemCode;}

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setItemType(String itemType){
        this.itemType = itemType;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public void setItemStock(int itemStock){
        this.itemStock = itemStock;
    }

    public String getMessage() {
        return null;
    }


}
