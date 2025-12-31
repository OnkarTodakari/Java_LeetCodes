/*
121. Best Time to Buy and Sell Stock

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
import java.util.*;
class StockBuySell
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
		 
		 int maxprofit=0;
		 int minprice=a[0];
		 for(int i=1;i<a.length;i++)
		 {
		    if(a[i]<minprice)
			{
			     minprice=a[i];
			}
			else
			{
			   int profit=a[i]-minprice;
			    if(profit>maxprofit)
				{
					maxprofit=profit;
				}
			}
		 }
		 System.out.println("Max Profit "+maxprofit);

	 }
}