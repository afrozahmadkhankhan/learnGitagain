
package com.abc.gitadd;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of length");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("* ");

			}
			System.out.println();

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("* ");

			}
			System.out.println();

		}

	}
}
