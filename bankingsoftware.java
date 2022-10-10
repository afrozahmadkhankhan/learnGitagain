package com.abc.gitadd;

import java.util.Scanner;

public class Alphanumeric {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name and adhar number");
		String name = scan.nextLine();
		String id = scan.nextLine();
		BankingApplication b = new BankingApplication(name, id);
		b.menu();

	}
}

class BankingApplication {
	double bal;
	double pereTrans;
	String name;
	String id;

	public BankingApplication(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	void checkBal() {
		System.out.println("your balance in your your screen please look on screan ");
	}

	void depositBal(double deposit) {
		bal = deposit;
	}

	void withDraw(double withdraw) {
		if (bal > withdraw) {
			bal = bal - withdraw;
			pereTrans = withdraw;
		}
	}

	void prvTrans() {
		System.out.println("previous transaction" + pereTrans);
	}

	void menu() {
		char option;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Welcome :" + name);
		System.out.println("And your id is" + id);
		System.out.println("\n");
		System.out.println("a:check the balance");
		System.out.println("b:deposit the balance");
		System.out.println("c:withdraw the balance");
		System.out.println("d:previous transaction");
		System.out.println("e:exit");

		do {
			System.out.println("======================================");
			System.out.println("choose an option");
			option = scan1.next().charAt(0);

			switch (option) {
			case 'a':
				System.out.println("your balanc is" + ":" + bal);
				System.out.println("\n");
				checkBal();
				break;

			case 'b':
				System.out.println("Deposit the balance");
				Double deposit = scan1.nextDouble();
				depositBal(deposit);
				System.out.println("\n");
				break;

			case 'c':
				System.out.println("Withdraw the balance");
				Double withdraw = scan1.nextDouble();
				withDraw(withdraw);
				System.out.println("\n");
				break;

			case 'd':
				System.out.println("previous transaction");
				prvTrans();
				System.out.println("\n");
				break;
			case 'e':
				System.out.println("Exit");
				System.out.println("\n");
				break;
			default:
				System.out.println("Choose a correct option to proceed");
				break;

			}

		} while (option != 'e');
		{
			System.out.println("Thanku for using banking service");
		}

	}

}
