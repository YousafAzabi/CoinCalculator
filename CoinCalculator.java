import java.util.ArrayList;

class CoinCalculator {

  public ArrayList<Integer> minNumberOfCoins(int[] coins, int value){
    ArrayList<Integer>  results = new ArrayList<Integer>();
    int i = 0;
    while ( i < coins.length ){
      value -= coins[i];
      if (value >= 0){
        results.add(coins[i]);
      } else {
        value += coins[i];
        i++;
      }
    }
    if (value == 0){
       return results;
    } else {
      return null;
    }
  }
}
