/*
Dr. Yousaf Azabi
2018
A class to calculat the require coins to represent a value.
The input is array of coins values and the value to be represented.
The output is an array of the coins required to represent the input value.
*/

import java.util.ArrayList;

public class CoinCalculator {

  public ArrayList<Integer> minNumberOfCoins(int[] coins, int value) {
    ArrayList<Integer>  results = new ArrayList<Integer>(); //results saved in this array
    int i = 0; //index to the array of coins value
    while ( i < coins.length ) { //loop until the last coin value
      value -= coins[i]; //input value is reduced by current coin value
      if (value >= 0) { //if the value is greater than 0
        results.add(coins[i]); //add coin value to the results
      } else {
        value += coins[i]; //if value less than 0 then add reduced value
        i++; //increment index to point to the next coin value
      }
    }
    if (value == 0) { //check if coins value can represent the input value
       return results; // return the results (array of coins)
    } else {
      return null; //if value cannot be represented by the coins return NULL
    }
  }
}
