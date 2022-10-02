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
	
	

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n=scan.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n-i;j++)
			 {
				System.out.print(" "); 
			 }
			 
			 for(int k=0; k<i+1;k++)
			 {
				 System.out.print(k+" ");
			 }
			 System.out.println();
		 }
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<i+1;j++)
			 {
				System.out.print(" "); 
			 }
			 
			 for(int k=0; k<n-i;k++)
			 {
				 System.out.print(k+" ");
			 }
			 System.out.println();
		 }
		 
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<i+1;j++)
			 {
				System.out.print(" "); 
			 }
			 
			 for(int k=0; k<n-i;k++)
			 {
				 System.out.print(k+" ");
			 }
			 System.out.println();
		 }
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n-i;j++)
			 {
				System.out.print(" "); 
			 }
			 
			 for(int k=0; k<i+1;k++)
			 {
				 System.out.print(k+" ");
			 }
			 System.out.println();
		 }
	
			 
		
		 
		 

	    }
	}



