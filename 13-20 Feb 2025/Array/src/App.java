
//PRINT ARRAY OF THAT SUM OF TWO SUBSET IS EQUAL TO THE ANSWER

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int ans = sc.nextInt();
        int count = 0 ;
        for(int i = 0 ; i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==ans){
                    System.out.println("index = " +i+" ,"+j);
                    System.out.println("values = "+arr[i] +" ,"+arr[j]);
                    System.out.println();
                    count += 1;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println("Count = "+count);
        sc.close();
    }
}











// // PRINT WHEATHER THE SUBSET OF ARRAY IS PRESENT OR NOTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// import java.util.*;
// public class App {
//     public static void main(String[] args) {
//         String a = "abcabcabc";
//         char[] arr = a.toCharArray();
//         boolean[] alpha = new boolean[26];
//         for(int i = 0 ; i<=arr.length-1;i++){
//             int ans = (int)arr[i]-'a';
//             boolean[ans] = true;
//         }
//         //System.out.println(Arrays.toString(arr));
//     }
// }








// PRINT WHEATHER THE SUBSET OF ARRAY IS PRESENT OR NOT

// public class App {
//     public static void main(String[] args) {
//         int[] a = {1,0,1,1,0,1,0,1,0,1,1};
//         int[] b= {1,0,1,0};
//         boolean found = false;
//         for(int i=0;i<=a.length-b.length;i++){
//         boolean ans = true;
//             for(int j=0;j<=b.length-1;j++){
//                 if(a[i+j] != b[j]){
//                     ans = false;
//                     break;
//                 }
//             }
//             if(ans) found=true;
//         }
//         System.out.println(found == true ? "Yes" : "No");;
//     }
// }











// PRINT ARRAY BY ROTATION

// import java.util.*;

// public class App {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

//         int[] temp = new int[n]; 
//         int N = sc.nextInt();
//         N %= n;

//         for (int i = 0; i < n; i++) {
//             temp[(i + N) % n] = arr[i];
//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }

//         System.out.println(Arrays.toString(arr));

//         sc.close();
//     }
// }











// // PRINT ARRAY OF LAST TO FIRST SWAP AND THAT ONE ELEMENT IS ONLY SWAP

// import java.util.*;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//         //int N = sc.nextInt();
//         int temp = arr[arr.length-1];

//         for(int i = arr.length-2;i>=0;i--){
//             arr[i+1] = arr[i];
//         }
//         arr[0]=temp;
//         System.out.println(Arrays.toString(arr));
        
//         sc.close();
//     }
// }










// PRINT ARRAY OF 0s TO LAST

// import java.util.Scanner;
// import java.util.Arrays;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//         int[] temp = new int[n];
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 temp[count] = arr[i];
//                 count++;
//             }
//         }
//         System.out.println(Arrays.toString(temp));
//         sc.close();
//     }
// }









// PRINT ARRAY 0s TO THE LAST USING PACKAGE

// import java.util.*;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Integer[] arr = new Integer[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//         List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//         int size = list.size();
//         for(int i= 0; i<size;i++){
//             if(list.get(i) == 0){
//                 list.remove(i);
//                 list.add(0);
//                 i--;
//                 size--;
//             }
//         }
//         System.out.println(list);
        
//         sc.close();
//     }
// }









// // PRINT ARRAY IN REVERSE USING REVERSE METHOD BY PACKAGE

// import java.util.*;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Integer[] arr = new Integer[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//         List<Integer> list = Arrays.asList(arr);
//         Collections.reverse(list);
//         System.out.println(list);
        
//         sc.close();
//     }
// }










// // PRINT ARRAY IN REVERSE USING SWAP FIRST AND LAST VALUES

// import java.util.*;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

//         for(int i =0 ; i<=arr.length/2;i++){
//             int t = arr[i];
//             arr[i] = arr[n-i-1];
//             arr[n-i-1] = t; 
//         }
//         System.out.println(Arrays.toString(arr));
        
//         sc.close();
//     }
// }







// // PRINT ARRAY IN REVERSE USING TEMP ARRAY

// import java.util.Scanner;
// import java.util.Arrays;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//         int[] temp = new int[n];

//         for(int i = 0 ; i <= arr.length-1 ; i++){
//             temp[n-i-1] = arr[i];
//         }

//         for(int i=0;i<= arr.length-1;i++){
//             arr[i] = temp[i];
//         }

//         System.out.println(Arrays.toString(arr));
        
//         sc.close();
//     }
// }









// PRINT ARRAY IN REVERSE ORDER
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i] + " ");
//         }
        
//         sc.close();
//     }
// }




//MAXXXXX USING SORT
// import java.util.Scanner;
// import java.util.Arrays;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

//         Arrays.sort(arr);
//         System.out.println("Max = "+ arr[arr.length-1]);
//         System.out.println("SecondMax = "+ arr[arr.length-2]);
//         System.out.println("ThirdMax = "+ arr[arr.length-3]);
        
//         sc.close();
//     }
// }









// // SECOND MAXXXX
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
//         int max = arr[0];
//         int smax = 0;
//         for(int i=0;i<=arr.length-1;i++){
//             if(arr[i]>max) max = arr[i];
//         }

//         for(int i=0;i<=arr.length-1;i++){
//             if(arr[i]>smax && arr[i] != max) smax = arr[i];
//         }
//         System.out.println("max= " + max);
//         System.out.println("secondMax= " + smax);
//         sc.close();
//     }
// }











//  MAXXXXXX
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println();
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
//         int max = arr[0];
//         for(int i=0;i<=arr.length-1;i++){
//             if(arr[i]>max) max = arr[i];
//         }

//         System.out.println();
//         System.out.println("max= " + max);
//         sc.close();
//     }
// }








// SEQUENCE OF NUMBER

// import java.util.Arrays;

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println();
//         int[] arr = {100,104,6,103,102,5};
//         int count = 1;
//         Arrays.sort(arr);
//         for(int i = 0;i<arr.length-1;i++){
//        //  arr[0]=1 + 1 =2  ==  arr[0+1]=arr[1]=2
//             if((arr[i]+1)==(arr[i+1])){
//                 count += 1;
//             }
//             else{
//                 continue;
//             }
//         }
//         System.out.println(count);
//         System.out.println();
//     }
// }
