/*
461. Hamming Distance
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
*/
import java.util.*;
class HammingDistance
{
      public static void main(String args[])
	  {
	      Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a x and Y");
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  
		  int xor=x^y;
		  
		  int count=0;
		  while(xor!=0)
		  {
		     count=count+xor&1;
			 xor=xor>>1;
		  }
		  System.out.println(count);
	  }
}