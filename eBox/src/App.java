// //Equalibrium index
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n < 2 && n > 500){
//             System.out.println("Invalid input");
//             return;
//         }
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++) arr[i] = sc.nextInt();
//         for(int i=0;i<n;i++) if(arr[i] != 1 && arr[i] != 8) {
//             System.out.println("Invalid");
//             return;
//         }
//         for(int mid=0;mid<n;mid++){
//             int left = 1;
//             int right = 1;
//             for(int i=0;i<=mid;i++) left*=arr[i];
//             for(int i=mid+1;i<n;i++) right*=arr[i];
//             if(left == right){
//                 System.out.println(mid+1);
//                 break;
//             }
//             if(mid == n-1 && left != right) System.out.println(-1);
//         }
//     }
// }








//Ap & Gp
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String[] arr = s.split(",");
//         int[] num = new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             num[i] = Integer.parseInt(arr[i]);
//         }
//         int diff = num[1]-num[0];
//         boolean isDiff = true;
//         for(int i=0;i<num.length-1;i++){
//             if(num[i]+diff != num[i+1]){
//                 isDiff = false;
//                 break;
//             }
//         }
//         if(isDiff) {
//             System.out.println(num[num.length-1]+diff);
//             return;
//         }
//         int div = num[1]/num[0];
//         boolean isDiv = true;
//         for(int i=0;i<num.length-1;i++){
//             if(num[i]*div != num[i+1]){
//                 isDiv = false;
//                 break;
//             }
//         }
//         if(isDiv) System.out.println(num[num.length-1]*div);
//     }
// }







//happyCoding
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m1 = sc.nextInt();
//         int m2 = sc.nextInt();
//         int happy = 0;
//         int coding = 0;
//         int happyCoding = 0;
//         for(int i=1;i<=n;i++){
//             if(i%m1==0 && i%m2==0){
//                 System.out.print("HappyCoding ");
//                 happyCoding++;
//             }
//             else if(i%m1==0){
//                 System.out.print("Happy ");
//                 happy++;
//             }
//             else if(i%m2==0){
//                 System.out.print("Coding ");
//                 coding++;
//             }
//             else System.out.print(i+" ");
//         }
//         System.out.println();
//         System.out.println("Happy-"+happy);
//         System.out.println("Coding-"+coding);
//         System.out.println("HappyCoding-"+happyCoding);
//     }
// }





//word game
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine().toUpperCase();
//         for(char ch:s.toCharArray()) if(Character.isDigit(ch)) {
//             System.out.println("Invalid");
//             return;
//         }
//         if((s.charAt(0) == 'B' || s.charAt(0) == 'L')&&(s.charAt(s.length()-1)=='E' || s.charAt(s.length()-1)=='R')){
//             for(char ch:s.toCharArray()) if(ch == 'K') System.out.println("Yes");
//         }
//         else System.out.println("No");
//     }
// }







// //Start & end letter
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String[] arr = new String[500];
//         int count = 0;
//         for(int i=0;i<500;i++){
//             String s = sc.nextLine();
//             if(!s.equals("####")) arr[count++] = s;
//             else break;
//         }
//         for(int i=0;i<count-1;i++){
//             if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0)) System.out.println(arr[i]);
//             else{
//                 System.out.println(arr[i]);
//                 break;
//             }
//             if(i == count-2) System.out.println(arr[i+1]);
//         }
//     }
// }






// //Max subArray
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++) arr[i] = sc.nextInt();
//         int maxSum = 0;
//         int currentSum = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] < arr[i]) currentSum += arr[i];
//             else {
//                 if (currentSum > maxSum) maxSum = currentSum;
//                 currentSum = arr[i]; 
//             }
//         }
//         if (currentSum > maxSum) maxSum = currentSum;
//         System.out.println(maxSum);

//     }
// }







// Chess
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int qx = sc.nextInt();
        int qy = sc.nextInt(); 
        char[][] board = new char[n][n];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == bx && j == by) board[i - 1][j - 1] = 'B';
                else if(i == qx && j == qy) board[i - 1][j - 1] = 'Q';
                else {
                    boolean bishop = canBishopAttack(bx, by, i, j);                         
                    boolean queen = canQueenAttack(qx, qy, i, j);
                    if(bishop && queen) board[i - 1][j - 1] = '%';
                    else if(bishop) board[i - 1][j - 1] = '*';
                    else if(queen) board[i - 1][j - 1] = '&';
                    else board[i - 1][j - 1] = '.';
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) System.out.print(board[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
    static boolean canBishopAttack(int bx, int by, int x, int y) {
        return Math.abs(bx - x) == Math.abs(by - y);
    }
    static boolean canQueenAttack(int qx, int qy, int x, int y) {
        return qx == x || qy == y || Math.abs(qx - x) == Math.abs(qy - y);
    }
}
