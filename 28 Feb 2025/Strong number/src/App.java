import java.util.*;
public class App {
    static int fact(int n){
        if(n <= 1) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int ref = i;
            int ref2 = ref;
            int ans = 0;
            while (ref != 0) {
                int digit = ref % 10;
                ans += fact(digit);
                ref /= 10;
            }
            if(ref2 == ans) System.out.print(ref2+" ");
        }
        sc.close();
    }
}


