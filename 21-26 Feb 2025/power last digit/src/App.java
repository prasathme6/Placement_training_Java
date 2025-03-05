
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = power(a,b);
        System.out.println(c%10);
        sc.close();
    }

    static int power(int a,int b){
        int ans = 1;
        for(int i = 1 ; i <= b ; i++){
            ans *= a;
        }
        return ans;
    }
}