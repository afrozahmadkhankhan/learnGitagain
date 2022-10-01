package com.abc.gitadd;

import java.util.Arrays;
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
	
	public static boolean check(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			
			
			int[] ar1=new int[26];
			int[]br1=new int [26];
			for(int i=0;i<s1.length();i++)
			{
				
				int index=(int)s1.charAt(i)-97;
				ar1[index]=ar1[index]+1;
			int	index2=s2.charAt(i)-97;
			br1[index2] = br1[index2]+1;
	
			}
			for(int i=0;i<26;i++)
			{
				if(ar1[i]!=br1[i])
			return false;
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		String s1="anagrma";
		String s2="amagran";
	boolean  	list=check(s1,s2);
	System.out.println( (list) ? "Anagrams" : "Not Anagrams" );
	}
}

