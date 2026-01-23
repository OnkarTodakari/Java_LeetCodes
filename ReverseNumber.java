/*
7. Reverse Integer

Input: x = 123
Output: 321
*/
import java.util.*;
class ReverseNumber {

    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int x=sc.nextInt();
        long rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
       System.out.println("Display Reverse Number..");
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
		{
			System.out.println(0);
		}
		else
		{
            

        System.out.println(rev);
		}
    }
}
