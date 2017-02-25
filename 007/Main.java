class Main {
  public static void main(String[] args) {
    int lastPrime = 13;
    int i = 6;
    while (i<10_001) {
      lastPrime +=2;
      boolean isPrime = true;
      for (int j=2; j<=Math.sqrt(lastPrime); j++) {
        if (lastPrime % j ==0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) i++;
    }
    System.out.println(lastPrime);
  }
}