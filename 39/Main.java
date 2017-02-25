class Main {
  public static void main(String[] args) {
    int maxP = 1;
    int maxSolutions = 0;
    for (int p = 1; p<=1000; p++) {
      int solutions = 0;
      for (int i=1; i<=Math.ceil(p/2)-1; i++) {
        for (int j=i; j <=Math.ceil(p/2)-1; j++) {
          for (int k=j; k<=Math.ceil(p/2)-1; k++) {
            if (i+j+k == p && i*i+j*j == k*k) solutions++;
          }
        }
      }
      if (solutions > maxSolutions) {
        maxSolutions = solutions;
        maxP = p;
      }
    }
    System.out.println(maxP);
  }
}
