package com.abc.gitadd;

public class LongestPalindrom {

	public static void main(String[] args) {
		String s = "mymadamisbad";
		String st = " ";
		int max = 0;
		String maximump = " ";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j >= i; j--) {
				st = s.substring(i, j);
				StringBuilder sb = new StringBuilder(st);
				sb.reverse();
				if (st.equals(new String(sb))) {
					if (max < sb.length()) {
						max = sb.length();
						maximump = st;

					}
				}
			}
		}
		System.out.println(maximump);
	}

}
