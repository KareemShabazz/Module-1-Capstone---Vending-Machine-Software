package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
	private String dateAndTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm:ss a"));
	File logFile = new File("log.txt");

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
		try(PrintWriter writeToLog = new PrintWriter(new FileWriter(logFile,true))) {
			writeToLog.println(dateAndTime +" Feed money: $" + moneyEntry + " $" + this.money);
			writeToLog.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

	public double moneyToCents() { //To Do
		double change = money;
		change *= 100;
		int quarters;
		int dimes;
		int nickels;
		quarters = (int) change / 25;
		change -= quarters * 25;
		dimes = (int) change / 10;
		change -= dimes * 10;
		nickels = (int) change / 5;
		change -= nickels * 5;

		System.out.println("Change: " + quarters + " quarters" + ", " + dimes + " dimes, " + nickels + " nickels");
		try(PrintWriter writeToLog = new PrintWriter(new FileWriter(logFile,true))) {
			writeToLog.println(dateAndTime +" Change: $" + money);
			writeToLog.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
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
					System.out.println("Item:" + element.getItemName() + " " + "Price:" + element.getItemPrice() + " " + "Remaining balance:" + subtractFromBalance(element.getItemPrice()));
					System.out.println(element.getMessage());
					element.reduceStock();
					try(PrintWriter writeToLog = new PrintWriter(new FileWriter(logFile,true))) {
						writeToLog.println(dateAndTime + " " + element.getItemName() + " " + element.getItemCode() + " $" + element.getItemPrice() + " $" + money);
						writeToLog.flush();
					} catch (IOException e) {
						e.printStackTrace();
						System.exit(1);
					}
				} else {
					System.out.println(element.getItemStock());
				}
			}
		}
	}

	public double subtractFromBalance(double itemPrice) {
		return this.money = getMoney() - itemPrice;

		//Subtract price of item from money balance
		//return money
	}

	public static void writeLog (double money, double change) throws FileNotFoundException {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
		String formattedDate = dateTime.format(myFormatObj);


		try(PrintWriter log = new PrintWriter(new FileOutputStream(new File("Log.txt"), true))) {
			log.println(formattedDate + " " + money + " " + change);
		}
	}

	}







