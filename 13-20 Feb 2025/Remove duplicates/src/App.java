//REMOVE DUPLICATES FROM ARRAY

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] temp = new int[n];
        int newSize = 0;
        for(int i = 0 ; i<=arr.length-1;i++){
            boolean flag = true;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    flag =false;
                }
            }
            if(flag){
                temp[newSize++] = arr[i];
            }
        }
        arr = Arrays.copyOf(temp, newSize);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}










//REMOVE DUPLICATES FROM ARRAY
// import java.util.*;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             int num = sc.nextInt();
//             set.add(num);
//         }

//         System.out.println(set);
//         sc.close();
//     }
// }