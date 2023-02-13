
package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Thread {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		for (int a : ar) {
			System.out.println(a + " ");
		}
	}
}