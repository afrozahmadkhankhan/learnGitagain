package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingName {

	public static void main(String[] args) {

		String s = "anees,arif,afroz,abdussalam";
		String[] ar = s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			solve(ar[i]);
		}
	}

	public static void solve(String s) {
		String s1 = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
	}
}
