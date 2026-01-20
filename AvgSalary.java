/*
1491. Average Salary Excluding the Minimum and Maximum Salary

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
*/
import java.util.*;

class AvgSalary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[4];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];
        int sum = 0;

   
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];

            if(a[i] < min)
                min = a[i];

            if(a[i] > max)
                max = a[i];
        }

       
        double average = (double)(sum - min - max) / (a.length - 2);

        System.out.println("Minimum Salary = " + min);
        System.out.println("Maximum Salary = " + max);
        System.out.println("Average Salary = " + average);
    }
}
