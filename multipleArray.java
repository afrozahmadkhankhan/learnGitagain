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

		
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=scan.nextInt();
	int [][] ar=new int [n][n];
	System.out.println("Enter array elements");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			
			ar [i][j]=scan.nextInt();
		}
	}
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}

		
		
}
	}