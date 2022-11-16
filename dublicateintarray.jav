package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class LongestPalindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}

		for (int j = 0; j < n; j++) {
			int x = ar[j];
			if (x == -1)
				continue;
			int count = 0;
			for (int k = 0; k < n; k++) {
				if (x == ar[k]) {
					count++;
					ar[k] = -1;
				}
			}
			System.out.println(x + " " + count);
		}

	}
}
