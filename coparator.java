package com.abc.gitadd;

import java.util.Comparator;
import java.util.TreeSet;

public class FrequencyFind {

	public static void main(String[] args) {
		CompareForPractice c = new CompareForPractice();
		TreeSet t = new TreeSet(c);
		
		t.add(10);
		t.add(6);
		t.add(15);
		t.add(5);
		System.out.println(t);
	}

}
class CompareForPractice implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer o=(Integer)o1;
		Integer o3=(Integer)o2;
		if(o>o3)
		{
			return -1;
		}
		else if(o<o3)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	
	}
}