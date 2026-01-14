/*
1281. Subtract the Product and Sum of Digits of an Integer


Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
*/
import java.util.*;
class ProductSumDigit
{
     public static void main(String args[])
	 {
	     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a Number");
		 int num=sc.nextInt();
		 
		 int temp=num;
		 int k=1,sum=0;
		 while(num!=0)
		 {
		    int rem=num%10;
			num=num/10;
			
			k=k*rem;
			sum=sum+rem;
			
		 }
		 
		 int result=k-sum;
		 
		 System.out.println("Result :"+ result);
	 }
}