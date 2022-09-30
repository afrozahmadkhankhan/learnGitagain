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
	//This is sum of digit 	
int  n=123;
int sum=0;
while(n>0)
{
int rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println(sum);



//This is use for strong numer

int n1=145;
int temp=n1;
int sum1=0;
while(n1>0)
{
	int fact=1;
	int rem=n1%10;
	for(int i=1;i<=rem;i++)
	{
		fact=fact*i;
		
	}
	n1=n1/10;
	sum1=sum1+fact;
}
if(sum1==temp)
{
	System.out.println(sum1);
	System.out.println("Strong number");
	//System.exit(sum1);
}
else
{
	System.out.println("not");
}

//This is for arm strong number 
		
int n3=153;
int sum3=0;
int temp1=n3;
		String 	s=Integer.toString(n3);
		int len=s.length();
		while(n3>0)
		{
			int rem=n3%10;
			 sum3=sum3+(int)(Math.pow(rem,len));
			n3=n3/10;
		}
		if(sum3==temp1)
		{
			System.out.println("armstrong numer");
			//System.exit(len);
		}
		else
		{
			System.out.println("Thi is not a harshad number");
		}
		
		
		//This is use for harshad number 
		int k=21;
		int tem=k;
		int summ=0;
		while(k>0)
		{
			int rem=k%10;
			 summ=summ+rem;
			k= k/10;
			
		}
		if(tem%summ==0)
		{
			System.out.println("harshad number");
			
		}
		else 
		{
			System.out.println("not");
		}
	}
}
