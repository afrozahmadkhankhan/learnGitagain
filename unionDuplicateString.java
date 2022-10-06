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

//FIND THE DUPLICATE COUNT AND VALUE
		String st="how are you are you good";
		String [] st1=st.split(" ");
		
		for(int i=0;i<st1.length-1;i++)
		{
			int count =1;
			
		for(int j=i+1;j<st1.length;j++)
		{
			if(st1[i].equals(st1[j]))
			
				count++;
			
			
		}
		if(count>1)
		{
			System.out.println(st1[i]+"  :  "+count);
		}
		}
		
		//HOW CAN FIND THE UNION USEING ARRAY
		int [] ar1= {1,2,3,4};
		int [] ar2= {1,2,3,4,5,6};
		String output=" ";
		for(int i=0;i<ar1.length;i++)
		{
			if(!output.contains(String.valueOf(ar1[i])))
			{
				output=output+String.valueOf(ar1[i]);
			}
		}
		for(int i=0;i<ar2.length;i++)
		{
			if(!output.contains(String.valueOf(ar2[i])))
			{
				output=output+String.valueOf(ar2[i]);
			}
		}
		
		String [] ar3=output.split(",");
		for(String se : ar3)
		{
			System.out.println(se+" ");
		}
		
	}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


	
			 
		
		 
		 

	    
	



