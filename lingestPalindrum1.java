
package com.abc.gitadd;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		String s = "mymadamisbad";
		String temp = " ";
		String lp = " ";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j >= i; j--) {
				temp = s.substring(i, j);
				StringBuffer str = new StringBuffer(temp);
				str.reverse();
				System.out.println(str);
				if (temp.equals(new String(str))) {
					if (str.length() > lp.length()) {

						lp = temp;
					}
				}
			}
		}
		System.out.println("The longest palindrum is" + lp);
	}
}
