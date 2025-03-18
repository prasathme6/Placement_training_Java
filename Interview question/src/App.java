// // bubble sort
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int[] arr = new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             for(int j=0;j<a-i-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int i : arr) {
//            System.out.print(i + " "); 
//         }
//         sc.close();
//     }
// }











// // frequency of every element
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String[] ss=s.split(" ");
//         sc.close();
//         Map<String,Integer> hash = new HashMap<String,Integer>();
//         for(String ch : ss) {
//             hash.put(ch,hash.getOrDefault(ch,0 )+1);
//         }
//         for(Map.Entry<String, Integer> entry : hash.entrySet()){
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
//     }
// }










// // Reverse a string using pointer
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder s = new StringBuilder(sc.nextLine());
//         sc.close();
//         int right = s.length()-1;
//         for(int left=0;left<s.length()/2;left++){
//             char temp = s.charAt(left);
//             s.setCharAt(left,s.charAt(right));
//             s.setCharAt(right, temp);
//             right--;
//         }
//         System.out.println(s);
//     }
// }









// Change the ith and jth position of the 32 bit integer
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        int inc = 1;
        while(num != 0){
            int rem = num % 2;
            int quo = num / 2;
            num = quo;
            ans += rem*inc;
            inc *= 10;
        }
        int i = sc.nextInt();
        int j = sc.nextInt();
        StringBuilder s = new StringBuilder(String.valueOf(ans));
        StringBuilder fina = new StringBuilder(String.format("%32s",s).replace(" ", "0"));
        System.out.println(fina);
        char temp = fina.charAt(i);
        fina.setCharAt(i, fina.charAt(j));
        fina.setCharAt(j, temp);
        System.out.println(fina);
        sc.close();
    }
}