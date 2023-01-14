
package com.abc.gitadd;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		String s = "mymadamisbad";
		int[] ar = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = (int) s.charAt(i) - 97;
			ar[index] = ar[index] + 1;
		}
		for (int i = 0; i < 26; i++) {
			if (ar[i] > 1) {
				System.out.println((char) (i + 97) + ": " + "repeaded " + ar[i] + " " + "times");
			}
		}
	}
}
