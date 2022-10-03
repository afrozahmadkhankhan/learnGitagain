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
			
		


		    BufferedReader   br= new BufferedReader(new InputStreamReader(in));
		  try { int n1=Integer.parseInt(br.readLine());
		        int n2=Integer.parseInt(br.readLine());
		        int n3=Integer.parseInt(br.readLine());
		        int n4=Integer.parseInt(br.readLine());
		        int n5=Integer.parseInt(br.readLine());
		        Prime ob=new Prime();
		        ob.checkPrime(n1);
		        ob.checkPrime(n1,n2);
		        ob.checkPrime(n1,n2,n3);
		        ob.checkPrime(n1,n2,n3,n4,n5);
		  }
		  catch(Exception e)
		  {
		      System.out.println(e);
		  }    
		     
		    }
}
class Prime {
    void checkPrime(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
		
	
		
		
		
    }     
}

	
			 
		
		 
		 

	    
	



