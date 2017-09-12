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

		for (int i = 0; i < totalSize; i++) {
			if (stocks[i] < stocks[min]) {
				min = i;
			}
			// System.out.println(min);
			int diff = stocks[i] - stocks[min];
			// System.out.println("diff" + diff);
			if (diff > maxDiff) {
				buy = min;
				// System.out.println(buy);
				sell = i;
				// System.out.println(sell);
				maxDiff = diff;
				// System.out.println(maxDiff);
			}
		}

		System.out.println("\nThe day to buy is " + buy + " at price " + stocks[buy]);
		System.out.println("\nThe day to sell is " + sell + " at price " + stocks[sell]);

	}
}
