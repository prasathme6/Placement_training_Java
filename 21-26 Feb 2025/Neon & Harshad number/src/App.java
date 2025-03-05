// //Harshad number          55 = 5+5=10 ---  55 % 10 == 0 ? harshad number 
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ref = n;
//         int digitSum = 0;
//         while(n != 0){
//             int N = n % 10;
//             digitSum += N;
//             n /= 10;
//         }
//         System.out.println(ref % digitSum == 0?"harshad number":"Not");
//         sc.close();
//     }
// }










import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i < n; i++) {
            int ref = i;
            int ref2 = ref;
            int digitSum = 0;
            while (ref != 0) {
                int N = ref % 10;
                digitSum += N;
                ref /= 10;
            }
            if(ref2 % digitSum == 0) System.out.print(ref2 + " ");
        }
        sc.close();
    }
}

//ronic number abandand number 







// //NEON number  n is square the number and add the digit is equal to the given n
// public class App {
//     public static void main(String[] args) throws Exception {
//         for(int i=1;i<=10000;i++){
//             int sqr = i * i;
//             int ref  = sqr;
//             int ans = 0;
//             while(sqr != 0){
//                 int N = sqr % 10;
//                 ans += N;
//                 sqr /= 10;
//             }
//             if(i == ans){
//                 System.out.println(i + " " + ref);
//             }
//         }
//     }
// }
