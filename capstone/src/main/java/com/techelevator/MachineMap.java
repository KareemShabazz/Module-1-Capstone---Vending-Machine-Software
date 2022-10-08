package com.techelevator;

import javax.crypto.Mac;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MachineMap extends Inventory {

    Map<String,String> nameMap = new HashMap<>();
    Map<String,Double> priceMap = new HashMap<>();
    Map<String,String> typeMap = new HashMap<>();
    Map<String, Integer> stockMap = new HashMap<>();

    public MachineMap(){
        Map<String,String> nameMap = this.nameMap;
        Map<String,Double> priceMap = this.priceMap;
        Map<String,String> typeMap = this.typeMap;
        Map<String, Integer> stockMap = this.stockMap;
    }

    public Map<String,/*VendingMachineItems*/ Double> accessInventoryMap(MachineMap machineMap){ //ATTENTION HERE
        try(Scanner inventoryScanner = new Scanner(listFile)) {
            while (inventoryScanner.hasNextLine()){
                String readInventory = inventoryScanner.nextLine();
                String [] line = readInventory.split("|");
                String itemCode = line[0];
                String itemName = line[1];
                double itemPrice = Double.parseDouble(line[2]);
                String itemType = line[3];
                int itemStock = 5;
                nameMap.put(itemCode,itemName);
                typeMap.put(itemCode, itemType);
                priceMap.put(itemCode, itemPrice);
                stockMap.put(itemCode,itemStock);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } return priceMap;
    }

}
