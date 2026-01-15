/*
2180. Count Integers With Even Digit Sum

Input: num = 4
Output: 2
Explanation:
The only integers less than or equal to 4 whose digit sums are even are 2 and 4. 
*/
import java.util.*;
class CountInt
{
      public static void main(String args[])
	  {
	     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a N");
		 int n=sc.nextInt();
		 int count=0;
        for(int i=1;i<=n;i++)
		{
			int sum=0;
			int temp=i;
			
			while(temp>0)
			{
				sum=sum+(temp%10);
				temp=temp/10;
			}
			
			if(sum%2==0)
			{
				count++;
			}
		}
		 
		 System.out.println(count);
	  }
}