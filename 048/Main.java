import java.math.BigInteger;

class Main {
  public static void main(String[] args) {
    BigInteger sum = BigInteger.ZERO;
    for (int i=1; i<=1000; i++) {
      String num = String.valueOf(i);
      sum = sum.add(new BigInteger(num).pow(i));
    }
    String sumString = sum.toString();
    System.out.println(sumString.substring(sumString.length()-10));
  }
}
