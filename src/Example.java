
class Example {
  public static void main(String args[]) {
    CoinCalculator coins = new CoinCalculator();
    int[] input = {20, 10, 5, 1};
    System.out.println(coins.minNumberOfCoins(input, 97));
  }
}
