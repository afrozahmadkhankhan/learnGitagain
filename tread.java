
package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Thread {

	public static void main(String[] args) {

		Abc x = new Abc();
		x.start();

	}
}

class Abc extends Thread

{
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				Thread.sleep(1000);
				System.out.println("Task checking for multi threading");
			}
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
		System.out.println("Task performance completed");
	}
}