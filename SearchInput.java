/*
35. Search Insert Position

Input: nums = [1,3,5,6], target = 5
Output: 2
*/
import java.util.*;
class SearchInput
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
	   
	   System.out.println("Enter a Search");
	   int skey=sc.nextInt();
	   System.out.println("Display the index number");
	  int index=a.length;
	   for(int i=0;i<a.length;i++)
	   {
	      if(a[i]>=skey)
		  {
			  index=i;
			  break;
		  }
		  
	   }
	   System.out.println("Index "+index);
	}
}