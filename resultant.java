package com.abc.gitadd;

import java.util.Scanner;

public class Resultant {

	public static void main(String[] args) {
		int[] ar = { 1, 4, 5, 2, 6, 8 };
		int factor = 1;
		for (int i = 1; i < ar.length; i++) {
			factor = factor * ar[i];
		}
		System.out.println(factor + "hiiiiiiiiiiiiiii");
		for (int j = 0; j < ar.length; j++) {
			ar[j] = factor / ar[j];
		}
		for (int k : ar) {
			System.out.println(k);
		}

	}
}
