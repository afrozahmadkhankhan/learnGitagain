package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class LongestPalindrom {

	public static void main(String[] args) {

		String s = "abcdefghh asjj asask";
		String[] d = s.split(" ");
		for (int i = 0; i < d.length; i++) {
			solve(d[i]);
		}

	}

	public static void solve(String f) {
		String e = " ";
		for (int i = f.length() - 1; i >= 0; i--) {
			e = e + f.charAt(i);
		}
		System.out.println(e);
		{

		}
	}
}
