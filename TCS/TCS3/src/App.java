// // // Bus Fair
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         int[] dis = {800,600,750,900,1400,1200,1100,1500};
//         String[] place = {"TH","GA","IC","HA","TE","LU","NI","CA"};
//         Scanner sc = new Scanner(System.in);
//         String firstPlace = sc.nextLine(); 
//         String secondPlace = sc.nextLine(); 
//         int left = 0;
//         int right = 0;
//         for(int i=0;i<dis.length;i++){
//             if(place[i].equals(firstPlace)) left = i;
//             if(place[i].equals(secondPlace)) right = i;
//         }
//         int sum = 0;
//         if(left > right){
//             for(int i=0;i<=right;i++) sum += dis[i];
//             for(int i=left+1;i<=dis.length-1;i++) sum += dis[i];
//         }
//         else{
//             for(int i=left+1;i<=right;i++) sum += dis[i];
//         }
//         double ans = (sum/50) * 0.25;
//         System.out.println(Math.ceil(ans)+" INR");
//         sc.close();
//     }
// }









// // Hungry monkey
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int noOfMonkey = sc.nextInt();
//         int oneTimeBanana = sc.nextInt();
//         int oneTimePeanut = sc.nextInt();
//         int noOfBanana = sc.nextInt();
//         int noOfPeanut = sc.nextInt();
//         while( noOfBanana >= oneTimeBanana || noOfPeanut >= oneTimePeanut){
//             if(noOfBanana >= oneTimeBanana){
//                 noOfMonkey--;
//                 noOfBanana-=oneTimeBanana;
//             }
//             else if(noOfPeanut >= oneTimePeanut) {
//                 noOfMonkey--;
//                 noOfPeanut-=oneTimePeanut;
//             }
//         }
//         if(noOfBanana > 0 && noOfPeanut > 0) noOfMonkey--;
//         System.out.println(noOfMonkey);
//         sc.close();
//     }
// }









// // Commission
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String parent = sc.nextLine();
//         String member = sc.nextLine().toUpperCase();
//         String child = member.equals("Y") ? sc.nextLine() : "";
//         String[] members = child.split(",");
//         if(member.equals("N")) System.out.println(parent+" :"+(5000*5/100));
//         else{
//             System.out.println(parent + " :"+ (5000*10/100)*members.length);
//             for(String s:members) System.out.println(s + " :"+(5000*5/100));
//         }
//         sc.close();
//     }
// }







// // Vending machine
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String item = sc.nextLine().toLowerCase();
//         int itemNo = sc.nextInt();
//         switch (item) {
//             case "c":
//                 switch (itemNo) {
//                     case 1:
//                         System.out.println("Enjoy your Espresso Coffee");
//                         break;
//                     case 2:
//                         System.out.println("Enjoy your Cappuccino Coffee");
//                         break;
//                     case 3:
//                         System.out.println("Enjoy your Latte Coffee");
//                         break;
//                     default:
//                         System.out.println("Invalid input");
//                         break;
//                 }
//                 break;
//             case "t":
//             switch (itemNo) {
//                 case 1:
//                     System.out.println("Enjoy your Plain tea");
//                     break;
//                 case 2:
//                     System.out.println("Enjoy your ginger tea");
//                     break;
//                 case 3:
//                     System.out.println("Enjoy your assam tea");
//                     break;
//                 case 4:
//                     System.out.println("Enjoy your lemon tea");
//                     break;
//                 case 5:
//                     System.out.println("Enjoy your green tea");
//                     break;
//                 default:
//                     System.out.println("Invalid input");
//                     break;
//             }
//             break;
//             case "s":
//                 switch (itemNo) {
//                     case 1:
//                         System.out.println("Enjoy your hot soup");
//                         break;
//                     case 2:
//                         System.out.println("Enjoy your veg corn soup");
//                         break;
//                     case 3:
//                         System.out.println("Enjoy your tomota soup");
//                         break;
//                     default:
//                         System.out.println("Invalid input");
//                         break;
//                 }
//                 break;
//             case "b":
//                 switch (itemNo) {
//                     case 1:
//                         System.out.println("Enjoy your hot chocolate");
//                         break;
//                     case 2:
//                         System.out.println("Enjoy your badam drink");
//                         break;
//                     case 3:
//                         System.out.println("Enjoy your pista drink");
//                         break;
//                     default:
//                         System.out.println("Invalid input");
//                         break;
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid input");
//                 break;
//         }
//         sc.close();
//     }
// }







//doctor income
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] age = new int[n];
//         for(int i=0;i<n;i++){
//             int ages = sc.nextInt();
//             if(ages < 121 && ages > 0) age[i] = ages;
//             else{
//                 System.out.println("Invalid input");
//                 return;
//             }
//         }
//         int income = 0;
//         for(int i:age){
//             if(i < 17) income += 200;
//             else if(i >= 17 && i <= 40) income += 400;
//             else income += 300;
//         }
//         System.out.println(income+" INR");
//         sc.close();
//     }
// }






// Prime
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         if(n<0) System.out.println("enter positive number");
//         else System.out.println(prime(n));
//         sc.close();
//     }
//     static boolean prime(int n){
//         boolean flag = true;
//         if(n <= 1) flag = false;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i == 0){
//                 flag = false;
//                 break;
//             }
//         }
//         return flag;
//     }
// }







// //find the 15th term
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(n%2==0 ? ((n/2)-1)*6 : (n/2)*7);
//         sc.close();
//     }
// }







//find the series
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(n%2 == 0 ? (n/2)-1 : ((n/2)+(n/2)));
//         sc.close();
//     }
// }







// //play with vowal and consonants
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String[] arr = s.split(" ");
//         sc.close();
//         Map<Character,Integer> hash = new HashMap<>();
//         hash.put('a', 1);hash.put('e', 1);hash.put('i', 1);hash.put('o', 1);hash.put('u', 1);
//         String ans = "";
//         if(arr[0].length() > 5 &&  arr[1].length() > 5 && arr[2].length() > 5) {
//             System.out.println("Invaild input");
//             return;
//         }
//         else{
//             for(char ch:arr[0].toCharArray()){
//                 if(hash.containsKey(ch)) ans += "%";
//                 else ans += ch;
//             }
//             for(char ch:arr[1].toCharArray()){
//                 if(!hash.containsKey(ch)) ans += "#";
//                 else ans += ch;
//             }
//             ans += arr[2].toUpperCase();
//         }
//         System.out.println(ans);
//     }
// }







import java.util.*;
public class App {
    public static void generatePermutations(int[] arr, int index) {
        String str = "";
        for(int i:arr) str += String.valueOf(i);
        if (str.length() == 3) {
            System.out.println(str); 
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            generatePermutations(arr, index + 1); 
            swap(arr, i, index); 
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        generatePermutations(arr, 0);
    }
}
