import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if((a^1) > a){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        sc.close();
    }
}






// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         if((a&1) == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }

//         sc.close();
//     }
// }






// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         if((a|1) > a){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }

//         sc.close();
//     }
// }








// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         if(a % 2 == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }

//         sc.close();
//     }
// }

