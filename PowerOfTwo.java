/*
231. Power of Two
Input: n = 16
Output: true
Explanation: 24th = 16
*/
import java.util.*;

class PowerOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}