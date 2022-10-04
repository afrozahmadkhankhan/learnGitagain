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

import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class FrequencyFind {
	
	

	public static void main(String[] args) {
			
	String s="abcdefghijklmnopqrstuvwxyz";
	int [] ar = new int[26];
	for(int i=0;i<s.length();i++)
	{
	int	index=(int)s.charAt(i)-97;
	ar[index]= ar[index]+1;
		
	
	}
	int count =0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>0)
		{
			count++;
		}	
	
	}
	if(count==0)
	{
		System.out.println("Not a panagram");
	}
	else
	{
		System.out.println("pan");
	}
		
		
    }     
}

	
			 
		
		 
		 

	    
	



