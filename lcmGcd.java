package com.abc.gitadd;

import java.util.Scanner;

public class Alphanumeric {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Eneter the n1 and n2");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		solve(n1, n2);

	}

	public static void solve(int n1, int n2) {
		int max = 0;
		max = (n1 > n2) ? n1 : n2;
		while (true) {
			if (max % n1 == 0 && max % n2 == 0) {
				System.out.println(max);
				System.exit(0);
			}
			max++;
		}
	}

}