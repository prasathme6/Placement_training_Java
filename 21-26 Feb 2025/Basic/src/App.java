public class App {
    //fact fib prime
    static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }
    static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    static void seriesfib(int n){
        int first = 0;int second = 1;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<n;i++){
            int next = first + second;
            System.out.print(next+ " ");
            first = second;
            second = next;
        }
    }
    static boolean prime(int n){
        if(n <= 1) return false;
        boolean primeo = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                primeo =false;
                break;
            }
        }
        return primeo;
    }
    static void seriesPrime(int n){
        for(int i=1;i<n;i++){
            boolean prime = true;
            if(i<2) prime = false;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime) System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) throws Exception {
       System.out.println(fact(5));
       System.out.println(fib(10));
       seriesfib(11);System.out.println();
       System.out.println(prime(7));
       seriesPrime(50);
       
    }
}