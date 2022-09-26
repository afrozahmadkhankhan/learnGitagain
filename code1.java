package com.abc.gitadd;

public class FrequencyFind {

	public static void main(String[] args) {
	int [] ar = {1,5,3,2,4,3,9,8,6,9};
	//find the duplicate value
	int x;
	for(int i=0;i<ar.length;i++)
	{
		x=ar[i];
		if(x==-1)
			continue;
		int count =0;
		for(int j=0;j<ar.length;j++)
		{
			if(x==ar[j])
			{
				count++;
				ar[i]=-1;
			}
			
		}
		if(count>1)
		{
			System.out.println(x+"repeated"+count);
		}
		
	}
		
	}

}