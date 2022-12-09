package com.abc.gitadd;

import java.util.Scanner;

public class LongestPlaindram {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 2, 3, 5, 12 };
		int x = 0;
		for (int i = 0; i < ar.length; i++) {
			x = ar[i];
			if (x == -1)
				continue;
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (x == ar[j]) {
					count++;
					ar[i] = -1;

				}
			}
			if (count > 1) {
				System.out.println(x + ":-" + count + "-" + "Times");
			}

		}

	}
}
