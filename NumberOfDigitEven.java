/*
1295. Find Numbers with Even Number of Digits

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/
import java.util.*;
class NumberOfDigitEven
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Enter a Number");
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		   
		}
		
		int evenc=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int count=0;
			while(temp!=0)
			{
			  int rem=temp%10;
			  count++;
			  temp=temp/10;
			  
			}
		    if(count%2==0)
			{
				evenc++;
			}
			
		}
		System.out.println(evenc);
			
			
		
		
		
	 }
}