package com.techelevator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Purchase<LogWriter>
{private List<VendingMachineItems> purchases = new ArrayList<VendingMachineItems>();// used item reference to make list of purchase
    private double balance= 0.00;

    //getter

    public double getBalance() {

        return balance;
    }

    // not testable due to the balance being a local var?
    //feed money method that updates balance here
    public void feedMoneyPurchase(double deposit) {

        balance = (balance + deposit);

    }

    // not testable due to the balance being a local var?
    //method for adding purchase which will update the balance
    public void addPurchase(VendingMachineItems choice) {// made need to update the total price elsewhere?

        //add purchase to the list
        purchases.add(choice);

        //update the remaining money
        double purchasePrice = choice.getItemPrice();
        balance = balance - purchasePrice;

        //need to add log?
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter targetFormat = DateTimeFormatter.ofPattern("MM/dd/yyy hh:mm a");
        Logger logger = new Logger ("log.txt");
        logger.writeToFile(currentDateTime.format(targetFormat)+ " " + choice.getItemName() + " "
                + choice.getItemCode()+ "\\ $ " + balance + (purchasePrice) + "\\ $ " + balance);

    }

    // not testable due to the balance being a local var?
    public String toString(VendingMachineItems choice) {
        choice.getMessage();
        String str= "------------------------------\n";
        for (VendingMachineItems purchases: this.purchases){
            str += "Your order:"+ purchases.getItemName()+"\n";
            str += "------------------------------\n";
            str += "Total Price: $"+ purchases.getItemPrice()+ "\n";
            str += "------------------------------\n";
        }

        str += "Money Remaining: $" + balance;

        return str;
    }



}

