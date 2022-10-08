package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

import com.techelevator.VendingMachineItems;

import com.techelevator.*;
import com.techelevator.Chip;

public class Menu {

	private PrintWriter out;
	private Scanner in;
	public double money = 0;
	private int change = 0;

	public double getMoney() {
		return money;
	}

	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}

	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		return choice;
	}

	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return choice;
	}

	private void displayMenuOptions(Object[] options) {
		out.println();
		for (int i = 0; i < options.length; i++) {
			int optionNum = i + 1;
			out.println(optionNum + ") " + options[i]);
		}
		out.print(System.lineSeparator() + "Please choose an option >>> ");
		out.flush();
	}


	public void feedMoney() {
		Scanner moneyScanner = new Scanner(System.in);
		System.out.println("Enter amount (1,5,10) :");
		String moneyEntry = moneyScanner.nextLine();
		double money = Double.parseDouble(moneyEntry);
		if (money == 1 || money == 5 || money == 10) {
			this.money += money;
		}

	}

	public int moneyToCents() { //To Do
		change = (int) money;
		change *= 100;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		quarters = change / 25;
		change -= quarters * 25;
		dimes = change / 10;
		change -= dimes * 10;
		nickels = change / 5;
		change -= nickels * 5;

		System.out.println("Change: " + quarters + " quarters" + ", " + dimes + " dimes, " + nickels + " nickels");
		money = 0;
		return change;
	}



	public void purchase(List<VendingMachineItems> givenList) {
		if (money < 0.75) {
			System.out.println("***Insufficient funds***");
		} else {

			for (int i = 0; i < givenList.size(); i++) {
				System.out.println(givenList.get(i).getItemCode() + "|" +
						givenList.get(i).getItemName() + "|" +
						givenList.get(i).getItemPrice() + "|" +
						givenList.get(i).getItemType() + "|" + "Stock = " +
						givenList.get(i).getItemStock());
			}
		}
	}

	public void chooseItem(List<VendingMachineItems> givenList) {
		Scanner selectCode = new Scanner(System.in);
		System.out.println("Select Item Code: ");
		String userInput = selectCode.nextLine();
		for (VendingMachineItems element : givenList) {
			if (userInput.equals(element.getItemCode())) {
				if (!element.getItemStock().equals("Sold Out")) {
					System.out.println(element.getItemName() + " " + " " + element.getItemPrice() + " " + subtractFromBalance(element.getItemPrice()));
					element.reduceStock();
				} else {
					System.out.println(element.getItemStock());
				}
			}
		}
	}

	public double subtractFromBalance(double itemPrice){
		return this.money = getMoney() - itemPrice;

		//Subtract price of item from money balance
		//return money
	}
}






