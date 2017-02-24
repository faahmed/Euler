class Main {
  public static void main(String[] args) {
    double sumOfSquares = 0;
    for (int i=1; i<=100; i++) {
      sumOfSquares += Math.pow(i,2);
    }
    double squareOfSum = Math.pow(100*(101)/2,2);
    System.out.println(squareOfSum - sumOfSquares);
  }
}
