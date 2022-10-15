package com.abc.gitadd;

import java.util.Scanner;

public class Febonaci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(solve(n));

	}

	public static int solve(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n % 10 + solve(n = n / 10);
		}
	}
}
