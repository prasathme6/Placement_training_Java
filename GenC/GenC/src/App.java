// // liters per 100 km
//  import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         float fuel = sc.nextFloat();
//         float distance = sc.nextFloat();
//         if(fuel <= 0 || distance <= 0){
//             System.out.println("Invalid input");
//             return;
//         }
//         sc.close();
//         float liters = (fuel/distance)*100;
//         double miles = distance*0.6214;
//         double gallon = fuel*0.2642;
//         double US = miles / gallon;
//         System.out.printf("liters per 100km %.2f",liters);
//         System.out.println();
//         System.out.printf("gallon per miles %.2f",US);
//     }
// }





// // bill generator
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no of pizza bought: ");
//         int pizza = sc.nextInt();
//         System.out.print("Enter no of puffs bought: ");
//         int puffs = sc.nextInt();
//         System.out.print("Enter no of cold drink bought: ");
//         int drink = sc.nextInt();
//         sc.close();
//         System.out.println("Bill Details:");
//         System.out.println("No of pizza : "+ pizza);
//         System.out.println("No of puffs : "+ puffs);
//         System.out.println("No of cold drink : "+ drink);
//         System.out.println("Total price = "+((pizza*100)+(puffs*20)+(drink*10)));
//         System.out.println("ENJOY THE SHOW!!!");

//     }
// }







// // Alphabets
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[4];
//         for(int i=0;i<4;i++){
//             arr[i] = sc.nextInt();
//         }
//         for (int i : arr) {
//             System.out.println(i+"-"+(char)i);
//         }
//     }
// }






// // Placement
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no of student places in CSE: ");
//         int cse = sc.nextInt(); 
//         System.out.print("Enter no of student places in ECE: ");
//         int ece = sc.nextInt();
//         System.out.print("Enter no of student places in MECH: ");
//         int mech = sc.nextInt(); 
//         sc.close();
//         if(cse < 0 || ece < 0 || mech < 0){
//             System.out.println("Invalid input");
//             return;
//         }
//         else if(cse == 0 && ece == 0 && mech == 0){
//             System.out.println("None of the department got the highest placement");
//             return;
//         }
//         else{
//             int maxi = Math.max(cse, Math.max(ece, mech));
//             if (cse == maxi) System.out.println("CSE");
//             if (ece == maxi) System.out.println( "ECE");
//             if (mech == maxi) System.out.println("MECH");
//             System.out.println();
//         }
//     }
// }






// // Theatre
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of tickets: ");
        int tickets = sc.nextInt();
        sc.nextLine();
        if(tickets < 5 || tickets > 40) {
            System.out.println("minimum 5 and maximum 40");
            return;
        }
        System.out.print("do you want refeshment: ");
        String refresh = sc.nextLine().toUpperCase();
        System.out.print("Do you have coupon code: ");
        String coupon = sc.nextLine().toUpperCase();
        System.out.print("enter a circle: ");
        String circle = sc.nextLine().toUpperCase();
        if(circle.equals("K") || circle.equals("Q")) {
            float TicCost = (circle.equals("K")) ? tickets*75 :tickets*150;
            float ref = (refresh.equals("Y")? tickets*50:0);
            if (coupon.equals("Y")) {
                TicCost -= TicCost * 2 / 100;
            }
            if (tickets > 20) {
                TicCost -= TicCost * 10 / 100;
            }
            System.out.println(TicCost + ref);
        }
        else{
            System.out.println("Invalid input");
            return;
        }
    }
}






// // Course
// import java.util.HashMap;
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the no of course: ");
//         int n = sc.nextInt();
//         if(n < 1){
//             System.out.println("invalid range");
//             return;
//         }
//         System.out.println("enter the course: ");
//         Map<String,Integer> hash = new HashMap<>();
//         for(int i=0;i<=n;i++){
//             hash.put(sc.nextLine(), i);
//         }
//         System.out.println("enter the course to be searched: ");
//         String s = sc.nextLine();
//         System.out.println(hash.containsKey(s)?s+" is available" : s+" is not available");
//     }
// }








// // Salary
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the salary: ");
//         int salary = sc.nextInt();
//         System.out.print("enter the performance rating: ");
//         float rating = sc.nextFloat();
//         if(rating <= 0 || rating >5){
//             System.out.println("invaild input");
//             return;
//         }
//         if(rating <= 3) System.out.println(salary + (salary*10/100));
//         else if(rating >= 3.1 && rating <= 4) System.out.println(salary + (salary*25/100));
//         else if(rating >= 4.1 && rating <= 5) System.out.println(salary +(salary*30/100));
//     }
// }






// // palindrome
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n < 0){
//             System.out.println("invalid input");
//             return;
//         }
//         int ref = n;
//         int ans = 0;
//         while(n != 0){
//             ans = ans*10 + (n%10);
//             n/=10;
//         }
//         System.out.println(ref == ans ? "palindrome" : "not");
//     }
// }








// //primeUptoN
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int start = sc.nextInt();
//         int end = sc.nextInt();
//         sc.close();
//         if(end < start){
//             System.out.println("invaild range");
//             return;
//         }
//         while(start != end){
//             boolean flag = true;
//             for(int i=2;i<=Math.sqrt(start);i++){
//                 if(start%i == 0){
//                     flag = false;
//                     break;
//                 }
//             }
//             if(flag) System.out.print(start+" ");
//             start++;
//         }
//     }
// }






//season
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n<1 || n>12){
//             System.out.println("invaild month");
//             return;
//         }
//         if(n>=3 && n<=5) System.out.println("spring");
//         else if(n>=6 && n<=8) System.out.println("summer");
//         else if(n>=9 && n<=11) System.out.println("autumn");
//         else if(n==12 || n<=2) System.out.println("winter");

//     }
// }
