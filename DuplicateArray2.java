
package com.abc.gitadd;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		for (int b : ar) {
			System.out.print(b + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			int x = ar[i];
			if (x == -1)
				continue;
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (x == ar[j]) {
					count++;
					ar[i] = -1;
				}
			}
			if (count > 1) {
				System.out.println(x + ":" + "repeated" + count + ":" + "time");
			}
		}

	}
}
