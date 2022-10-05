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
			

		int [] ar = {1,2,3,4,56,7,8};
		int m=3;
		int ins=40;
		int [] br=new int[ar.length+1];
		for(int i=0;i<ar.length;i++)
		{
		if(i<m)
		{
			br[i]=ar[i];
		}
		else if(i==m)
		{
			br[i]=ins;		
		}
		else 
		{
			br[i]=ar[i];
		}
		
		}
		
		for(int k : br)
		{
			System.out.println(k);
		}
		
		
    }     
}

	
			 
		
		 
		 

	    
	



