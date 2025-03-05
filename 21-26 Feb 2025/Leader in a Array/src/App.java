import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println();
        sc.close();

        for(int i=0; i<=n-1; i++){
            boolean flag = true;
            for(int j=i+1; j<=n-1; j++){
                if(arr[i] < arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(arr[i]+ " ");
        }
    }
}








// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++) arr[i] = sc.nextInt();
//         System.out.println();
//         sc.close();

//         int defaultLeader = arr[n-1];
//         for(int i=0; i<=n-1; i++){
//             int leader = 0;
//             for(int j=i+1; j<=n-1; j++){
//                 if(arr[i] > arr[j]){
//                     leader = arr[i];
//                 }
//                 else{
//                     break;
//                 }
//             }
//             System.out.print(leader+ " ");
//         }
//         System.out.print(defaultLeader);
//     }
// }