package com.abc.gitadd;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "AAAAAAAABBBBBCCCCCCCDDDDDD";
		int[] ar = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = (int) s.charAt(i) - 65;
			ar[index] = ar[index] + 1;
		}
		for (int i = 0; i < 26; i++) {
			if (ar[i] != 0) {
				System.out.println((char) (65 + i) + "  " + ar[i]);
			}

		}

	}
}
