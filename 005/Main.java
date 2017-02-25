class Main {
  public static void main(String[] args) {
    int ans = 0;
    boolean notFound = true;
    for (int i=20; notFound;i+=20) {
      ans = i;
      for (int j=1; j<=20; j++) {
        if (i%j !=0) {
          notFound = true;
          break;
        } else {
          notFound = false;
        }
      }
    }
    System.out.println(ans);
  }
}