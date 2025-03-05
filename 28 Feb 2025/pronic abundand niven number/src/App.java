import java.util.*;
public class App {
    static boolean pronic(int n){
        for(int i=0;i<=Math.sqrt(n);i++){
            if(i * (i+1) == n){
                return true;
            }
        }
        return false;
    }
    static boolean abundant(int n){
        int ans = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) ans += i;
        }
        return ans > n;
    }
    static boolean niven(int n){
        int ref = n;
        int ans = 0;
        while(n != 0){
            int N = n%10;
            ans += N;
            n/=10;
        }
        return ref%ans==0;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int condition = (pronic(n) ? 4 : 0) + (abundant(n) ? 2 : 0) + (niven(n) ? 1 : 0);
        switch (condition) {
            case 7 -> System.out.println("The given number is pronic, abundant, and Niven");
            case 6 -> System.out.println("The given number is pronic and abundant");
            case 5 -> System.out.println("The given number is pronic and Niven");
            case 4 -> System.out.println("The given number is only pronic");
            case 3 -> System.out.println("The given number is abundant and Niven");
            case 2 -> System.out.println("The given number is only abundant");
            case 1 -> System.out.println("The given number is only Niven");
            default -> System.out.println("The given number does not satisfy any condition");
        }
        sc.close();
    }
}
