package com.abc.gitadd;

public class FrequencyFind {

	public static void main(String[] args) {
		String s="COMPUTERSCIENCE";
		char [] ch=s.toCharArray();
		int [] ar = new int [26];
		for(int i=0;i<ch.length;i++)
		{
		int index	=(int)ch[i]-65;
		ar[index]=ar[index]+1;
		}
		int count=0;
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]>1)
			{
				System.out.println((char)(j+65)+"Repeated");
			}
			
		}
        System.out.println("Done");
		
		
	}

}