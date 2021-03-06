import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    long start = System.nanoTime();
    List<Integer> abundantNumbers = new ArrayList<Integer>();
    int sumOfNonAbundantSums = 0;
    for (int i=1; i<=28_123; i++) {
      if (sumProperDivisors(i) > i) {
        abundantNumbers.add(i);
      }
      if (!abundantSum(abundantNumbers, i)) {
        sumOfNonAbundantSums+=i;
      }
    }
  }
  public static int sumProperDivisors(int n) {
    int sum = 0;
    for (int i=2; i<=Math.sqrt(n); i++) {
      if (n%i==0) {
        sum+=i;
        if (n%(n/i)==0 && i!=Math.sqrt(n)) {
          sum+=(n/i);
        }
      }
    }
    return sum+1;
  }
  public static boolean abundantSum(List<Integer> abundantNumbers, int sum) {
    for (int j : abundantNumbers) {
      for (int k : abundantNumbers) {
        if (j+k==sum) {
          return true;
        }
      }
    }
    return false;
  }
}

