class Main {    
  public static final int N = 100;
  //P(n,k): The number of ways of partitioning n
  //such that the largest split has size k
  static long[][] partitionNK = new long[N+1][N+1];
  public static void main(String[] args) {
    partitionNK[1][1] = 1;
    System.out.println(partition(N) - 1); //at least one split
    }
    public static long partition(long n) {
      for (int i=2; i<= n; i++) {
        for (int j=1; j<=i; j++) {
          partitionNK[i][j] = partitionNK[i-1][j-1] + partitionNK[i-j][j];
        }      
      }      
      long sum = 0;        
      for (long pNK : partitionNK[(int)n]) {
        sum+= pNK;
      }
        return sum;
    }
}
