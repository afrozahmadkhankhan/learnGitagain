package com.abc.gitadd;

public class LongestPalindrom {

	public static void main(String[] args) {
		int[] ar = { 1, 3, 2, 6, 5, 3, 2, 12, };
		for (int i = 0; i < ar.length; i++) {
			int x = ar[i];
			if (x == -1)
				continue;
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (x == ar[j]) {
					count++;
					ar[j] = -1;
				}
			}
			System.out.println(x + ":" + count + ">" + "times");
		}

	}

}
