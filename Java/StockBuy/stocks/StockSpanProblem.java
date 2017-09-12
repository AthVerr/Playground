/*
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just 
before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, 
then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
 */

package stocks;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
	public static void main(String[] args) {
		int price[] = { 20, 7, 5, 30, 110, 80 };
		int S[] = new int[price.length];
		int stockPrice[] = { 30, 7, 8, 31, 10, 2 };
		int Span[] = new int[price.length];
		calculateSpan(price, price.length, S); //brute force
		System.out.print(Arrays.toString(S));
		
		calculateSpanEfficient(stockPrice, stockPrice.length, Span); //linear time 
		System.out.print(Arrays.toString(Span));
	}

	private static void calculateSpanEfficient(int[] stockPrice, int length, int[] span) {
        Stack<Integer> stack= new Stack<>();
        stack.push(0); 
        span[0] = 1;
  
        for (int i = 1; i < length; i++)
        {
            while (!stack.empty() && stockPrice[stack.peek()] <= stockPrice[i])
                stack.pop();
            span[i] = (stack.empty())? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
		
	}

	private static void calculateSpan(int[] price, int length, int[] s) {
		s[0] = 1;

		for (int i = 1; i < length; i++) {
			s[i] = 1;
  // find if the number in the index is has any smaller numbers before of it
			for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
				s[i]++;
		}
	}
}
