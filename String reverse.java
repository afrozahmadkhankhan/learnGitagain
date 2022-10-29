package com.abc.gitadd;

public class LongestPalindrom {

	public static void main(String[] args) {

		String s = "aneeskahan dqdwdh wdqwohi";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			solve(s1[i]);
		}

	}

	public static void solve(String s2) {
		String d = " ";
		for (int i = s2.length() - 1; i >= 0; i--) {
			d = d + s2.charAt(i);

		}
		System.out.println(d);
	}

}
