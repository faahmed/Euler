import java.util.Stack;

class Main {
  public static void main(String[] args) {
    int largestPalindrome = 0;
    for (int i=100; i<1000; i++) {
      for (int j=100; j<1000; j++) {
        if (isPalindrome(i*j) && i*j > largestPalindrome) largestPalindrome = i*j;
      }
    }
    System.out.println(largestPalindrome); 
  }
  public static boolean isPalindrome(int n) {
    String number = Integer.toString(n);
    Stack<Character> digits = new Stack<Character>();
    if (number.length()%2==0){
      for (int i=0; i<number.length()/2; i++){
      digits.push(new Character(number.charAt(i)));
      }
      for (int i=number.length()/2; i<number.length(); i++) {
        if (number.charAt(i) != digits.pop()) return false;
      }
    } else {
      for (int i=0; i<Math.floor(number.length()/2); i++){
        digits.push(new Character(number.charAt(i)));
      }
      for (double i=Math.floor(number.length()/2)+2; i<number.length(); i++) {
        if (number.charAt((int)i) != digits.pop()) return false;
      }
    }
    return true;
  }
}