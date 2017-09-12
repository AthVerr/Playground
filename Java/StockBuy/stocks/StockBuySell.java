/*
 * The cost of a stock on each day is given in an array, 
 * find the max profit that you can make by buying and selling in those days.
 */
package stocks;

public class StockBuySell {
	public static void main(String[] arg) {
		int stocks[] = { 9, 3, 10, 50, 20, 2, 11, 23 };
		int buy = 0;
		int sell = 0;
		getBestTime(stocks, stocks.length);
	}

	private static void getBestTime(int[] stocks, int totalSize) {
		int buy = 0, sell = 0, min = 0;
		int maxDiff = 0;
		// Prices must be given for at least two days
        if (totalSize == 1)
            return;
        
		for (int i = 0; i < totalSize; i++) {
			if (stocks[i] < stocks[min]) {
				min = i;
			}
			int diff = stocks[i] - stocks[min];
			if (diff > maxDiff) {
				buy = min;
				sell = i;
				maxDiff = diff;
			
			}
		}

		System.out.println("\nThe day to buy is " + buy + " at price " + stocks[buy]);
		System.out.println("\nThe day to sell is " + sell + " at price " + stocks[sell]);
		System.out.println("\nsThe maximum profit is " + maxDiff);

	}
}
