package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
import com.techelevator.Inventory;
import com.techelevator.VendingMachineItems;
import com.techelevator.Candy;
import com.techelevator.Chip;
import com.techelevator.Drink;
import com.techelevator.Chip;
import com.techelevator.VendingMachineCLI;

public class Menu {

	private PrintWriter out;
	private Scanner in;
	private double money = 0;
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


	public void feedMoney(){
		Scanner moneyScanner = new Scanner(System.in);
		System.out.println("Enter amount (1,5,10) :");
		String moneyEntry = moneyScanner.nextLine();
		double money = Double.parseDouble(moneyEntry);
		if (money == 1 || money == 5 || money == 10){
			this.money += money;
		}

	}

	public int moneyToCents(){
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

		System.out.println("Change: " + quarters + " quarters" + ", " + dimes + " dimes, " + nickels + " nickels" );
		money = 0;
		return change;
	}

	public void purchase(){
		if (money < 0.75){
			System.out.println("***Insufficient funds***");
		}


	}



}
