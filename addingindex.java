package com.abc.gitadd;

import java.util.Scanner;

public class AddingIndex {

	public static void main(String[] args) {
		int[] ar = { 1, 4, 3, 2, 5, 6, 7, 9 };
		int j = 0;
		int k = 0;
		for (int i = 0; i < ar.length; i++) {
			if (i <= 1) {
				j = j + ar[i];
			} else {
				k = k + ar[i];
			}

		}
		System.out.println(j + " " + k);

	}
}
