/*
Each day, you can either buy one share of WOT, sell any number of shares of WOT that you own, or not make any transaction at all. 
What is the maximum profit you can obtain with an optimum trading strategy?
*/
package stocks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockBuySell2 {
	 public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int numOfTestCase = sc.nextInt();
         for (int i = 0; i < numOfTestCase; i++) {
                int days = sc.nextInt();
                long profit = 0;
                int[] stockPrice = new int[days];

                for (int j = 0; j < days; j++) {
                      stockPrice[j] = sc.nextInt();
                }

                int currMax = Integer.MIN_VALUE;
               //iterate backwards
                for (int j = days - 1; j >= 0; j--) {
                      if (stockPrice[j] >= currMax) {
                             currMax = stockPrice[j];
                      }
                      profit += (currMax - stockPrice[j]);
                }
                System.out.println(profit);


         }
  }
  }
	 

		
