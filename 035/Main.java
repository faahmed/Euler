class Main {
  public static void main(String[] args) {
    int primes = 4;
    for (int i=11; i<1_000_000; i+=2){
      boolean add = true;
      if (isPrime(i)) {
        char[] digits = Integer.toString(i).toCharArray();
        //j is the offset, k is the index for the rotatedNumber
        for (int j=1; j<=digits.length-1;j++) {
          char[] rotatedNumber = new char[digits.length];
          for (int k=0; k<digits.length; k++) {
            rotatedNumber[k] = digits[(k+j)%rotatedNumber.length];
          }
          if (!isPrime(Integer.parseInt(new String(rotatedNumber)))) {
            add = false;
            break;
          }
        }
      } else {
        add = false;
      }
      if (add) {
        primes++;
        System.out.println(i);
      }
    }
    System.out.println(primes);
  }
  public static boolean isPrime(int n) {
    for (int i=2; i<=Math.sqrt(n); i++) {
      if (n%i==0) return false;
    }
    return true;
  }
}
