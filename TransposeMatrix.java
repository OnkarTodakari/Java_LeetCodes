/*
867. Transpose Matrix


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
*/
import java.util.*;
class TransposeMatrix
{
     public static void main(String args[])
	 {
	     Scanner sc=new Scanner(System.in);
		 int a[][]=new int[3][3];
		 System.out.println("Enter a Matrix");
		 for(int i=0;i<a.length;i++)
		 {
		    for(int j=0;j<a.length;j++)
			{
			    a[i][j]=sc.nextInt();
			}
		 }
		 
		 System.out.println("Display ther Transpose Matrix");
		 for(int i=0;i<a.length;i++)
		 {
		    for(int j=0;j<a.length;j++)
			{
			   System.out.print(a[j][i]);
			}
			System.out.println();
		 }
		 
	 }
}