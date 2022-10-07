package com.techelevator;

public class VendingMachineItems {

    private String itemCode;
    private String itemName;
    private String itemType;
    private int itemStock = 5;
    private double itemPrice;
    private String itemSlot;
    private String message;

//Constructor
    public VendingMachineItems(String itemCode, String itemName, String itemType, int itemStock, double itemPrice, String itemSlot){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemStock = itemStock;
        this.itemPrice = itemPrice;
        this.itemSlot = itemSlot;

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

    public String getItemSlot(){
        return this.itemSlot;
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

    public void setItemSlot(String itemSlot){
        this.itemSlot = itemSlot;
    }

    public String getMessage() {
        return null;
    }


}
