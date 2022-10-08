package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Inventory {

    File listFile = new File("C:\\Users\\Student\\workspace\\Mod 1 Capstone\\" +
            "module-1-capstone-team-3\\capstone\\vendingmachine.csv");

    private Map<String,VendingMachineItems> inventoryMap = new HashMap<>();

    List<VendingMachineItems> vendingMachineItems = new ArrayList<VendingMachineItems>();

    public void convertFileToItemsList() {
        File listFile = new File("C:\\Users\\Student\\workspace\\Mod 1 Capstone\\" +
                "module-1-capstone-team-3\\capstone\\vendingmachine.csv");

        try (Scanner readFile = new Scanner(listFile)) {
            while (readFile.hasNextLine()) {
                String lineOfInput = readFile.nextLine();
                String[] splitStringArray = lineOfInput.split("\\|");
                if (splitStringArray[splitStringArray.length - 1].equals("Candy")) {
                    Candy candyObject = new Candy(splitStringArray[0], splitStringArray[1], Double.parseDouble(splitStringArray[2]), splitStringArray[3]);
                    vendingMachineItems.add(candyObject);
                }
                else if (splitStringArray[splitStringArray.length - 1].equals("Chip")){
                    Chip chipObject = new Chip(splitStringArray[0], splitStringArray[1], Double.parseDouble(splitStringArray[2]), splitStringArray[3]);
                    vendingMachineItems.add(chipObject);
                } else if(splitStringArray[splitStringArray.length - 1].equals("Drink")){
                    Drink drinkObject = new Drink(splitStringArray[0], splitStringArray[1], Double.parseDouble(splitStringArray[2]), splitStringArray[3]);
                    vendingMachineItems.add(drinkObject);
                } else {
                    Gum gumObject = new Gum(splitStringArray[0], splitStringArray[1], Double.parseDouble(splitStringArray[2]), splitStringArray[3]);
                    vendingMachineItems.add(gumObject);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<VendingMachineItems> getVendingMachineItems() {
        return vendingMachineItems;
    }

    public Map<String, VendingMachineItems> getInventoryMap() {
        return inventoryMap;
    }

    public Map<String,VendingMachineItems> accessInventoryMap(){ //ATTENTION HERE
        try(Scanner inventoryScanner = new Scanner(listFile)) {
            while (inventoryScanner.hasNextLine()){
                String readInventory = inventoryScanner.nextLine();
                String [] line = readInventory.split("|");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } return null;
    }




}
