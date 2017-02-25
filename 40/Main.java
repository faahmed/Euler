class Main {
    public static void main(String[] args) {
        int product = 1;
        for (int i =1; i<=1000000; i*=10) {
            product *= d(i);
        }
        System.out.println(product);
    }
    public static int d(int n){
        StringBuilder sb = new StringBuilder();
        for (int i=1; sb.length() < n; i++){
            sb.append(String.valueOf(i));
        }
        return Integer.parseInt(sb.toString().substring(n-1, n));
    }
}
