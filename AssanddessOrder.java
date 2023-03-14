
package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = 0;
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		for (int k = 0; k < n; k++) {
			for (int l = k + 1; l < n; l++) {
				if (ar[k] < ar[l]) {
					temp = ar[k];
					ar[k] = ar[l];
					ar[l] = temp;
				}
			}
		}

		for (int i : ar) {
			System.out.println(i);
		}
	}
}