/*
409. Longest Palindrome

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
*/
import java.util.*;

class LongestPalindrom
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        int freq[] = new int[128]; 

       
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        boolean oddFound = false;

        
        for(int i = 0; i < freq.length; i++)
        {
            if(freq[i] % 2 == 0)
            {
                count += freq[i];
            }
            else
            {
                count += freq[i] - 1;
                oddFound = true;
            }
        }

        if(oddFound)
        {
            count++;
        }

        System.out.println(count);
    }
}
