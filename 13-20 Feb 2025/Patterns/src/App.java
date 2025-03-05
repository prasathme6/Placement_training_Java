import java.util.Scanner;

public class App {
    public static void generateFibonacci(int[] fib, int n) {
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = (n*(n-1))/2;
        int[] fib = new int[k];
        generateFibonacci(fib, k);
        int index = 0;
        for(int i = 1; i <= n-1; i++){
            for(int j = 0; j <= i-1;j++){
                System.out.print(fib[index++] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// 0
// 1 1
// 2 3 5
// 8 13 21 34
// 55 89 144 233 377








// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int primeIndex = 0;
//         System.out.println();
        
//         int[] primes = generatePrimes(n * n); 
        
//         for (int i = n; i >= 1; i--) {
//             for (int s = 0; s < n - i; s++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(primes[primeIndex] + " ");
//                 primeIndex++;
//             }
//             System.out.println();
//         }

//         for (int i = 2; i <= n; i++) {
//             for (int s = 0; s < n - i; s++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(primes[primeIndex] + " ");
//                 primeIndex++;
//             }
//             System.out.println();
//         }

//         sc.close();
//     }

//     public static int[] generatePrimes(int limit) {
//         int[] primes = new int[limit];
//         int num = 2, count = 0;
//         while (count < limit) {
//             if (isPrime(num)) {
//                 primes[count++] = num;
//             }
//             num++;
//         }
//         return primes;
//     }

//     public static boolean isPrime(int num) {
//         if (num < 2) return false;
//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) return false;
//         }
//         return true;
//     }
// }

//    2 3 5 7 11
//   13 17 19 23
//      29 31 37
//         41 43
//            47 
//         53 59
//      61 67 71
//   73 79 83 89










// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();
//         for(int i = 1; i <= n; i++){
//             for(int k=1; k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i;j++){
//                 System.out.print(j);
//             }
//             for(int j = i-1; j >= 1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

//     1
//    121
//   12321
//  1234321
// 123454321






// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();
//         for(int i = 1; i <= n; i++){
//             for(int k=1; k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i;j++){
//                 System.out.print(j);
//             }
//             for(int j = 1; j <= i-1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

//     1
//    121
//   12312
//  1234123
// 123451234








// import java.util.Scanner;

// public class App {

//     public static int factorial(int num){
//         int fact = 1;
//         for(int i= 1;i<=num;i++){
//             fact *= i;
//         }
//         return fact;
//     }

//     public static int binomialCoeff(int n,int r){
//         return factorial(n)/(factorial(r) * factorial(n-r));
//     }
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();
//         for(int i = 1; i <= n; i++){
//             for(int k=1; k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i;j++){
//                 System.out.print(binomialCoeff(i-1,j-1) + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

//     1
//    1 1
//   1 2 1 
//  1 3 3 1
// 1 4 6 4 1







// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();
//         for(int i = 1; i <= n; i++){
//             for(int k=1; k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }


//     1
//    1 2
//   1 2 3 
//  1 2 3 4
// 1 2 3 4 5







// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();
//         int k = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i;j++){
//                 System.out.print(k + " ");
//                 k+=1;
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// 1
// 2 3
// 4 5 6 
// 7 8 9 10






// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i;j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5






// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// 1
// 1 2
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5





// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n-1; i++){
//             for(int j = 0; j <= n-i-1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// * * * * * 
// * * * *
// * * *
// * *
// *




// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n; i++){
//             for(int j = 0; j<=i; j++){
//                 if(j == i || j==0 || i == n){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

//  * 
//  * *
//  *   *
//  *     *
//  * * * * *






// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n; i++){
//             for(int k = 0; k<n-i; k++){
//                 System.out.print(" ");
//             }
//             for(int j = 0; j <i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
//
//     *
//    * *
//   * * *
//  * * * *
// * * * * *






// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n; i++){
//             for(int k = 0; k<n-i; k++){
//                 System.out.print(" ");
//             }
//             for(int j = 0; j <i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
// 
//     *
//    **
//   ***
//  ****
// *****







// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n; i++){
//             for(int k = 0; k<i; k++){
//                 System.out.print(" ");
//             }
//             for(int j = 0; j <n-i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// *****
//  ****
//   ***
//    **
//     *




// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = n-1; i >= 0; i--){
//             for(int j = 0; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// * * * * * 
// * * * *
// * * *
// * *
// *





// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n-1; i++){
//             for(int j = 0; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
//
// * 
// * *
// * * *
// * * * *
// * * * * *







// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 if((i == 0 && (j == 0 || j == n-1))||(i==n/2 && j==n/2)||(i==n-1 && (j == 0 ||j==n-1))){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// *       * 

//     *

// *       *








// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 if(i == j || i+j == n-1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// *       * 
//   *   *
//     *
//   *   *   
// *       *








// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n-1; i++){
//             for(int j = 0; j <= n-1; j++){
//                 if(i == n/2 || j == n/2){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

//     *     
//     *
// * * * * *
//     *
//     *







// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0; i <= n; i++){
//             for(int j = 0; j <= n; j++){
//                 if(i == 0 || j == 0 || j == n || i == n){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
//
// * * * * * * 
// *         *
// *         *
// *         *
// *         *
// * * * * * *







// public class App {
//     public static void main(String[] args) throws Exception {
//         int n = 4;
//         int originalN = n;
//         n = 2 * n;
//         for(int row = 0; row <= n; row++){
//             for(int col = 0; col <= n; col++){
//                 int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
//                 System.out.print(atEveryIndex + "  ");
//             }
//             System.out.println();
//         }
//     }
// }

// 4  4  4  4  4  4  4  4  4  
// 4  3  3  3  3  3  3  3  4
// 4  3  2  2  2  2  2  3  4
// 4  3  2  1  1  1  2  3  4
// 4  3  2  1  0  1  2  3  4
// 4  3  2  1  1  1  2  3  4
// 4  3  2  2  2  2  2  3  4
// 4  3  3  3  3  3  3  3  4
// 4  4  4  4  4  4  4  4  4









// static void pattern1(int n){
//     for(int row = 0; row <= 2*n; row++){
//         int totalColRow=row > n ? 2 * n - row : row;
//         for(int space = 0; space<=n-row;row++){
//             System.out.print(" ");
//         }
//         for(int col = 0;col <= totalColRow;col++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }








// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String x = sc.next();
//         int n = 9;
        
//         switch (x) {
//             case "A":
//                 for(int i=1; i<=n; i++){
//                     for(int j=1;j <=n ;j++){
//                         if((j==3 && (i==1 || i==2 || i==3))||(i==3 && (j==1 || j==2))){
//                             System.out.print("A  ");
//                         }
//                         else{
//                             System.out.print("1  ");
//                         }
//                     }
//                     System.out.println();
//                 }
//                 break;
            
//                 case "B":
//                 for(int i=1; i<=n; i++){
//                     for(int j=1;j <=n ;j++){
//                         if((j==3 && (i==1 || i==2 || i==3))||(i==3 && (j==1 || j==2))||(i==1&&j==2)){
//                             System.out.print("B  ");
//                         }
//                         else{
//                             System.out.print("1  ");
//                         }
//                     }
//                     System.out.println();
//                 }
//                 break;
        
//             default:
//                 for(int i=1; i<=n; i++){
//                     for(int j=1;j <=n ;j++){
//                         System.out.print("1  ");
//                     }
//                     System.out.println();
//                 }
//                 break;
//         }

//         sc.close();
//     }
// }
