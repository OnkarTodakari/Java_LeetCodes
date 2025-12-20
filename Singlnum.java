/*
136. Single Number
Input: nums = [2,2,1]

Output: 1
*/
import java.util.*;
class Singlnum
{
    public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter a Array");
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		}
		
		System.out.println("Remove Dublicate element and show only Singl value");
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			
			for(int j=0;j<a.length;j++)
			{
				  if(a[i]==a[j])
				  {
					  k++;
				  }
			}
			if(k==1)
			{
				System.out.println(a[i]);
				break;
			}
		}

		
	}
}