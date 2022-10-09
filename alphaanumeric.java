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

public class Alphanumeric {
	
	

	public static void main(String[] args) {
	String s = "A4B3C8";
	for(int i=0;i<s.length();i=i+2)
	{
		int num=Integer.parseInt(s.charAt(i+1)+"");
		
		int j = 0;
		while(j>num)
		{
			System.out.print(s.charAt(i));
			j++;
		}
	}
