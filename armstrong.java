package com.abc.gitadd;

import java.util.Scanner;

public class Resultant {

	public static void main(String[] args) {
		int n = 153;
		int sum = 0;
		int temp = n;
		String s = Integer.toString(n);
		int len = s.length();
		while (n > 0) {
			int rem = n % 10;
			sum = sum + (int) Math.pow(rem, len);
			n = n / 10;
		}
		System.out.println(sum);
		if (sum == temp) {
			System.out.println("yes");
			System.exit(len);
		} else {
			System.out.println("not");
		}
 
	}
}
