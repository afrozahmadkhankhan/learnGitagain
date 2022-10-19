package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Febonaci {

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
		int n = sacn.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < n; i++) {
			int c = a + b;
			System.out.println(c);
			b = c;
			a = b;
		}
	}
}
