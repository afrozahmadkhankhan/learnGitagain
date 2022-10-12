package com.abc.gitadd;

import java.util.Scanner;

public class Febonaci {

	public static void main(String[] args) {
		String s = "rajarammohanroy";
		String temp = "";
		int max = 0;
		String mximumpalindrom = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j >=i; j--) {
				temp = temp + s.substring(i, j);
				StringBuilder sb = new StringBuilder(temp);
				sb.reverse();
				if (temp.equals(new String(sb))) {

					if (max > sb.length()) 
					{
						
						mximumpalindrom = temp;
					}
					
				}
				
			}
		
		}
		
		System.out.println(mximumpalindrom);
	}

}
