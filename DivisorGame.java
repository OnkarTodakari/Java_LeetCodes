/*
1025. Divisor Game

Input: n = 2
Output: true
Explanation: Alice chooses 1, and Bob has no more moves.
*/
import java.util.*;
class DivisorGame
{
     public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
	
		if(num%2==0)
		{
		  System.out.println("true");
		}
	   else
	   {
		   System.out.println("false");
	   }
	 }
}