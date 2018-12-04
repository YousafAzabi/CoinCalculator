# Coin Calculator

The user inputs the coins and the value to be presented by the input coins.

```java
CoinCalculator coins = new CoinCalculator();
System.out.println(coins.minNumberOfCoins({20, 10, 5, 1}, 57));
```

#### Example
If the input coins array is {20, 10, 5, 1} and the input value is 57 then the output {20, 20, 10, 5, 1, 1}

The main class is CoinCalculator.java which includes the code for finding coins.
The second file Example.java contains a class which has main() function that implements main class.

To run the code download src folder and compile both files in one line as:

```bash
javac CoinCalculator.java Example.java
```

And then to run the code

```bash
java Example
```
