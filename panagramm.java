package com.abc.gitadd;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] ar = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = (int) s.charAt(i) - 97;
			ar[index] = ar[index] + 1;
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 1) {
				System.out.println("not");
				System.exit(i);
			}

		}
		System.out.println("yes");
	}
}
