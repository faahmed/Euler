import java.math.BigInteger;

class Main {
  public static void main(String[] args) {
    BigInteger number = new BigInteger("2").pow(1000);
    char[] digits = number.toString().toCharArray();
    int sum =0;
    for (char digit : digits) sum+=Character.getNumericValue(digit);
    System.out.println(sum);
  }
}