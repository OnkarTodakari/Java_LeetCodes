/*
202. Happy Number

Input: n = 19
Output: true

*/
import java.util.*;
class HappyNumber
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
        while(num!=1 && num!=4)
		{
			int sum=0;
			while(num!=0)
			{
				int rem=num%10;
				num=num/10;
				
				sum=sum+(rem*rem);
			}
			num=sum;
		}
		if(num==1)
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("No Happy Number");
		}
	 }
}