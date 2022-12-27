package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingName {

	public static void main(String[] args) {
		int[] ar = { 1, 3, 5, 7, 3, 5, 8, 9 };
		int x = 0;
		for (int i = 0; i < ar.length; i++) {
			x = ar[i];
			if (x == -1)
				continue;
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] == x) {
					count++;
					ar[i] = -1;
				}

			}
			if (count > 1) {
				System.out.println(x + " " + count);
			}

		}

	}
}
