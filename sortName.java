package com.abc.gitadd;

import java.util.Scanner;

public class SortingName {

	public static void main(String[] args) {
		String[] ar = { "afroz", "anees", "zahid", "bakreedu" };
		String temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i].compareTo(ar[j]) > 0) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (String name : ar) {
			System.out.println("The name sorting in assecending order"+name);
		}

	}
}
