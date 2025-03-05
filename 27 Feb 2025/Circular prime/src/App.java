// import java.util.*;
// public class App {
//     static boolean prime(int n){
//         if(n<2) return false;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     static boolean cirPrime(int n){
//         int count=0;int temp = n;
//         while(temp>0){
//             count+=1;
//             temp/=10;
//         }
//         int temp2 = n;
//         while(prime(temp2)){
//             int rem = temp2%10;
//             int qo = temp2/10;
//             int power =1;
//             for(int i=1;i<count;i++){
//                 power*=10;
//             }
//             temp2 = power*rem+qo;
//             if(temp2 == n)
//                 return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(cirPrime(n)) System.out.println("yes");
//         else System.out.println("no");
//         sc.close();
//     }
// }












import java.util.*;
public class App {
    static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    static boolean cirPrime(int n){
                int count=0;int temp = n;
                while(temp>0){
                    count+=1;
                    temp/=10;
                }
                int temp2 = n;
                while(prime(temp2)){
                    int rem = temp2%10;
                    int qo = temp2/10;
                    int power =1;
                    for(int i=1;i<count;i++){
                        power*=10;
                    }
                    temp2 = power*rem+qo;
                    if(temp2 == n)
                        return true;
                }
                return false;
            }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int n=1;n<i;n++){
            int ref = n;
            int ref2 = ref;
            int ans = 0;
            while (ref != 0) {
                int N = ref % 10;
                ans = (ans * 10) + N;
                ref /= 10;
            }
            if (prime(ref2) == true && prime(ans) == true)
                if(cirPrime(ref2)) System.out.print(ref2 +" ");
        }
        sc.close();
    }
}
