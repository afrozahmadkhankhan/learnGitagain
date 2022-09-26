package com.abc.gitadd;

public class FrequencyFind {

	public static void main(String[] args) {
		//Find prime number between 1 to 100
		
		int first = 1;
		int last = 100;
		for(int i=first;i<=last;i++)
		{
			checkPerform(i);
		}
		
	}
	public static void checkPerform(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println(n);
		}
		
	}

}