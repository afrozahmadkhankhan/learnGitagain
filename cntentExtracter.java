package com.abc.gitadd;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLDocument.Iterator;

public class FrequencyFind {

	public static void main(String[] args) {
	// This is use for solving tag content extracter HACKER RANK 	
	String pattern ="<([^>]+)>([^<>]+)</\\\\1>";
	Pattern r=Pattern.compile(pattern);
	Scanner scan = new Scanner(System.in);
		int sc=Integer.parseInt(scan.nextLine());
	while(sc>0)
	{
			String line = scan.nextLine();
			Matcher m=r.matcher(line);
			boolean findMatcher = true;
			while(m.find())
			{
				System.out.println(m.group(2));
				findMatcher=false;
			}
			if(findMatcher)
			{
				System.out.println("None");
			}
			sc--;
	}
	}
}