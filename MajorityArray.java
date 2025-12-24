/*
169. Majority Element


Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
import java.util.*;
class MajorityArray
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
         
		 int n=a.length;
		 int majority=-1;
		 
		 for(int i=0;i<a.length;i++)
		 {    int count=1;
			    for(int j=0;j<a.length;j++)
				{
					 if(a[i]==a[j])
					 {
						 count++;
					 }
				}
				if(count>n/2)
				{
					majority=a[i];
					break;
				}
		 }
		 if(majority !=-1)
		 {
			 System.out.println("Majority is :"+ majority);
		 }
		 else
		 {
			 System.out.println("No Majority");
		 }
	 }
}