import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    
    }
    static int fact(int n){
        return n!=0 ? n*fact(n-1) : 1;
    }
}











// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }
//         System.out.println(fact);
//         sc.close();
    
//     }
// }
