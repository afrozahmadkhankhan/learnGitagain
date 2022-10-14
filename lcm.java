package com.abc.gitadd;

import java.util.Scanner;

public class Febonaci {

	public static void main(String[] args) {

		int n1 = 20;
		int n2 = 25;
		solve(n1, n2);

	}

	public static void solve(int n1, int n2) {
		int max = (n1 > n2) ? n1 : n2;
		while (true) {
			if (max % n1 == 0 && max % n2 == 0) {
				System.out.println(max);
				System.exit(max);
			}
			max++;
		}
	}

}
