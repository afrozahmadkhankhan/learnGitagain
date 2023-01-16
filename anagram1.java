
package com.abc.gitadd;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		boolean res = isAnagram(a, b);
		System.out.println((res) ? "Anagram" : "not");

	}

	private static boolean isAnagram(String a, String b) {
		if (a.length() == b.length()) {
			int[] ar = new int[26];
			int[] br = new int[26];
			for (int i = 0; i < a.length(); i++) {
				int index = (int) a.charAt(i) - 97;
				ar[index] = ar[index] + 1;

				int index1 = (int) a.charAt(i) - 97;
				br[index1] = br[index1] + 1;
			}
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] != br[i]) {
					return false;
				} else {
					return true;
				}
			}
		}
		return false;

	}
}
