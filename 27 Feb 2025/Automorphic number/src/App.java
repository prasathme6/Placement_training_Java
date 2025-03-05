import java.util.*;//range
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for(int n=1;n<no;n++){
            int sqr = n * n;
            int ref = n;
            boolean flag = true;
            while (ref > 0) {
                if (ref % 10 != sqr % 10) flag = false;
                ref /= 10;
                sqr /= 10;
            }
        if(flag) System.out.print(n+" ");
        }
        sc.close();
    }
}










// check automorphic
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sqr = n * n;
//         boolean flag = true;
//     while (n>0){
//         if(n%10 != sqr%10) flag = false;
//         n/=10;
//         sqr/=10;
//     }
//     System.out.println(flag ?"Automorphic number":"Not");
//         sc.close();
//     }
// }










// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sqr = n * n;
//         String ofN = Integer.toString(n);
//         int  len = ofN.length();
//         int ans = 0;
//         for(int i=0;i<len;i++){
//             int N = sqr%10;
//             if(i<len/2) ans = ans + N;
//             else ans = ans + N*10;
//             sqr/=10;
//         }
//         if(n == ans) System.out.println("Automorphic number");
//         else System.out.println("Not");
//         sc.close();
//     }
// }
