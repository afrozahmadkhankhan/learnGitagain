package com.abc.gitadd;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int last = scan.nextInt();
		for (int i = first; i < last; i++) {
			solve(i);
		}
	}

	public static void solve(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(n);
		}
	}
}
