import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        System.out.print(firstIndexOfFibWithNDigits(1000));
    }
    public static int firstIndexOfFibWithNDigits(int n){
        BigInteger limit = BigInteger.TEN.pow(n-1);
        int iterations = 1;
        for (BigInteger i=BigInteger.ZERO,j=BigInteger.ONE; j.compareTo(limit) < 0; iterations++) {
            BigInteger temp = j;
            j = i.add(j);
            i = temp;
        }
        return iterations;
    }
}
