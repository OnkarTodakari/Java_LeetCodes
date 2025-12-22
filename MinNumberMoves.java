/*
2037. Minimum Number of Moves to Seat Everyone

Input: seats = [3,1,5], students = [2,7,4]
Output: 4
Explanation: The students are moved as follows:
- The first student is moved from position 2 to position 1 using 1 move.
- The second student is moved from position 7 to position 5 using 2 moves.
- The third student is moved from position 4 to position 3 using 1 move.
In total, 1 + 2 + 1 = 4 moves were used.
*/
import java.util.*;
class MinNumberMoves
{
       public static void main(String args[])
	   {
	       Scanner sc=new Scanner(System.in);
		   int seats[]=new int[3];
           int student[]=new int[3];
          System.out.println("Enter a Seats");
		  for(int i=0;i<seats.length;i++)
		  {
		     seats[i]=sc.nextInt();
		  }
		  
		  System.out.println("Enter a student number ");
		  for(int j=0;j<student.length;j++)
		  {
		      student[j]=sc.nextInt();
		  }
		  
		  Arrays.sort(seats);
		  Arrays.sort(student);
		   int move=0;
		  for(int i=0;i<seats.length;i++)
		  {
		     move=move+Math.abs(seats[i]-student[i]);
		  }
		  
		   System.out.println(move);
		   
	   }
}