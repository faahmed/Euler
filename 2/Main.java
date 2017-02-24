class Main {
  public static void main(String[] args) {
    int sum = 0;
    for (int i=1;;i++) {
      int fibi = fib(i);
      if (fibi > 4_000_000) break;
      else if (fibi%2==0) sum += fibi;
    }
    System.out.println(sum);
  }
  public static int fib(int n) {
    if (n==1) return 1;
    if (n==2) return 2;
    return fib(n-1) + fib (n-2);
  }
}