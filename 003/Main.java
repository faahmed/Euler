class Main {
  public static void main(String[] args) {
    long n = 600851475143L;
    long sqrtn = 775146;
    long largestPrime = 1;
    for (long i =2; i<=sqrtn; i++) {
      if (n%i==0L) {
        if (n/i > sqrtn) {
          if (isPrime(n/i) && n/i > largestPrime) {
          largestPrime = n/i;
          continue;
          }
        }
        if (isPrime(i) && i > largestPrime) largestPrime = i;
      }
    }
    System.out.println(largestPrime);
  }
  public static boolean isPrime(long n){
    for (long i =2; i<=Math.sqrt(n); i++) {
      if (n%i==0) return false;
    }
    return true;
  }
}
