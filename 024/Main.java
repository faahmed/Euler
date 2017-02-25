import java.util.PriorityQueue;

class Main {
  public static void main(String[] args) {
    String string = "0123456789";
    for (int i=0; i < 999_999; i++) {
      string = permute(string);
    }
    System.out.println(string);
  }
  public static String permute(String string) {
    if (isDecreasing(string.substring(1))) {
      return resetFirstDigit(string);
    } else {
      return string.substring(0,1) + permute(string.substring(1));
    }
  }
  //replace the first digit in the string with the target digit from the rest
  //of the string which minimizes [target - first] = y , y > 0
  //then rebuild the rest of the string with an increasing order of the remaining digits
  public static String resetFirstDigit(String string) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int first = Character.getNumericValue(string.charAt(0));
    int y = Integer.MAX_VALUE;
    int bestTarget = 0;
    for (Character c : string.toCharArray()) {
      int target = Character.getNumericValue(c);
      if (target-first < y && target-first > 0) {
        y = target-first;
        bestTarget = target;
      }
      heap.add(Character.getNumericValue(c));
    }
    heap.remove(bestTarget);
    StringBuilder sb = new StringBuilder();
    while (!heap.isEmpty()) {
      sb.append(heap.poll());
    }
    return bestTarget+sb.toString();
  }
  public static boolean isDecreasing(String string) {
    for (int i=1; i<string.length(); i++) {
      if (Character.getNumericValue(string.charAt(i)) >
          Character.getNumericValue(string.charAt(i-1))) {
        return false;
      }
    }
    return true;
  }
}
