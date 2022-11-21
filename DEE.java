package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name and aadhar number");
		String name = scan.nextLine();
		String aadhar = scan.nextLine();

		BankApplication b = new BankApplication(name, aadhar);
		b.menu();
	}

}

class BankApplication {
	double bal;
	double pereTrans;
	String name;
	String aadhar;

	public BankApplication(String name, String aadhar) {
		super();
		this.name = name;
		this.aadhar = aadhar;
	}

	void checkBal() {
		System.out.println("check the balance on your c=screen ");
	}

	void deposit1(double deposit) {
		bal = deposit;
	}

	void withdraw(double withdra) {
		if (bal > withdra) {
			bal = bal - withdra;
			pereTrans = withdra;
			System.out.println("successfully withdraw the balance");

		}
	}

	void pretransaction() {
		System.out.println("yor pretrans is" + pereTrans);
	}

	void menu() {
		char option;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("welcome" + name);
		System.out.println("and yor aadhar number" + aadhar);
		System.out.println("\n");
		System.out.println("a:check the balance");
		System.out.println("b:deposit the balance");
		System.out.println("c:withdrw the balance");
		System.out.println("d:pretransaction the balance");
		System.out.println("e:exit from the software service");

		do {

			System.out.println("chose the option ");
			option = scan1.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'a':
				System.out.println("your balance " + ":" + bal);
				checkBal();
				System.out.println("\n");
				break;

			case 'b':
				System.out.println("deposite  the balance ");
				double deposit = scan1.nextDouble();
				deposit1(deposit);
				System.out.println("\n");
				break;

			case 'c':
				System.out.println("withdraw  the balance ");
				double withdra = scan1.nextDouble();
				withdraw(withdra);
				System.out.println("\n");
				break;

			case 'd':
				System.out.println("check the pretrans of  balance ");
				pretransaction();
				System.out.println("\n");
				break;

			case 'e':
				System.out.println("exit");
				System.out.println("\n");
				break;

			default:
				System.out.println("choose the correct option");
				break;
			}

		} while (option != 'e');
		{
			System.out.println("thanks for using banking application");
		}

	}

}
