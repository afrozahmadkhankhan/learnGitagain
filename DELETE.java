package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Palindrom {

	public static void main(String[] args) {

		String s = "A4B3C2";
		for (int i = 0; i < s.length(); i = i + 2) {
			int num = Integer.parseInt(String.valueOf(s.charAt(i + 1)));

			int j = 0;
			while (j < num) {
				j++;
				System.out.println(s.charAt(i));
			}
		}
	}

}
