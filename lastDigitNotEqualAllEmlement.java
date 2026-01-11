/*
3232. Find if Digit Game Can Be Won

Input: nums = [1,2,3,4,10]
Output: false
Explanation:
Alice cannot win by choosing either single-digit or double-digit numbers.
*/
import java.util.*;

class lastDigitNotEqualAllEmlement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Enter a Array");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int singleSum = 0;
        int doubleSum = 0;

      
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 10) {
                singleSum = singleSum + a[i];
            } else {
                doubleSum = doubleSum + a[i];
            }
        }

        
        if (singleSum > doubleSum || doubleSum > singleSum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
