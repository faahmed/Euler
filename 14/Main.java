class Main {
    public static void main(String[] args) {
        long startValue=1;
        long longestChainLength=0;
        for (long i=1; i<1_000_000L; i+=2) {
            long chainLengthi = chainLength(i);
            if (chainLengthi > longestChainLength) {
                startValue=i;
                longestChainLength=chainLengthi;
            }
        }
        System.out.println(startValue);
    }
    public static long chainLength(long start) {
        long length = 0;
        long node = start;
        while (node!=1) {
            length++;
            if (node%2==0) node/=2;
            else node=3*node+1;
        }
        length++;
        return length;
    }
}
