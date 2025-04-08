// *# count

//import java.util.*;
//public class TCS2{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		int starCount = 0;
//		int hashCount = 0;
//		for(char ch:s.toCharArray()){
//			if(ch == '*') starCount++;
//			else if(ch == '#') hashCount++;
//			else System.out.println("enter valid input");
//		}
//		System.out.print(starCount-hashCount);
//	}
//}






// greatest number in array

//import java.util.*;
//public class TCS2{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
//		int max = 1;
//		for(int i=0;i<n-1;i++){
//			if(arr[i] < arr[i+1]) max++;
//		}
//		System.out.println(max);
//	}
//}







// count max 1's in row

//import java.util.*;
//public class TCS2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        int[][] arr = new int[row][col];
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++) arr[i][j] = sc.nextInt();
//        }
//		int max = 0;                 
//        for(int i=0;i<row;i++){
//	     int count = 0;
//            for(int j=0;j<col;j++) if(arr[i][j] == 1) count++;
//	     if(count > max) max = i;
//        }
//        System.out.println("max "+max);
//        sc.close();
//    }
//}






// max person on cruise

//import java.util.*;
//public class TCS2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] entry = new int[n];
//        for(int i=0;i<n;i++){
//            entry[i] = sc.nextInt();
//        }
//	     int[] exit = new int[n];
//        for(int i=0;i<n;i++){
//            exit[i] = sc.nextInt();
//        }
//		int max = 0;
//		int maxPerson = 0;
//		for(int i=0;i<n;i++){
//		maxPerson = maxPerson + entry[i] - exit[i];
//		if(max < maxPerson) max = maxPerson;
//		}
//		System.out.println(max);
//    }
//}







// odd balloon

//import java.util.*;
//public class TCS2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        char[] balloon = new char[n];
//        for(int i=0;i<n;i++){
//            balloon[i] = sc.next().charAt(0);
//        }
//		Map <Character,Integer> hash = new HashMap<>();
//		for(char ch:balloon) hash.put(ch,hash.getOrDefault(ch,0)+1);
//		boolean flag = false;
//		for(char ch:balloon){
//			if(hash.get(ch)%2 != 0){
//				flag = true;
//				System.out.println(ch);
//				break;
//			}
//		}
//		if(!flag) System.out.println("All are even");
//    }
//}






// sold candy

//import java.util.*;
//public class TCS2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int total = 10;
//		int minCandy = 5;
//		int sold = sc.nextInt();
//		if(total-sold >= minCandy){
//			System.out.println("sold "+sold);
//			System.out.println("left "+(total-sold));
//		}
//         else{
//			System.out.println("Max limit reacted");
//		}
//    }
//}






// trainee selection

//import java.util.*;
//public class TCS2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int total = sc.nextInt();
//	int[] arr = new int[total];
//	for(int i=0;i<total;i++) arr[i] = sc.nextInt();
//	int sum = 0;
//	for(int i=0;i<total;i++) sum += arr[i];
//	int avg = sum/arr.length;
//	for(int i=0;i<total;i++) if(arr[i] > avg) System.out.println("trainee number "+ (i+1));
//    }
//}






// washing machine

//import java.util.*;
//public class TCS2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int total = sc.nextInt();
//	if(total >= 0 && total <= 2000) System.out.println("25 min");
//	else if(total >= 2001 && total <= 4000) System.out.println("35 min");
//	else if(total >= 4001 && total <= 7000) System.out.println("45 min");
//	else if(total > 7000) System.out.println("Overload");
//	else System.out.println("Invalid input");
//    }
//}







// wall painting

//import java.util.*;
//public class TCS2 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int noInt = sc.nextInt();
//		int noExt = sc.nextInt();
//		double total = 0;
//		for(int i=0;i<noInt;i++) total += sc.nextDouble() * 18;
//		for(int i=0;i<noExt;i++) total += sc.nextDouble() * 12;
//		System.out.println(total);
//    }
//}






//Encrytion
import java.util.*;
public class TCS2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int key = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(char ch:s.toCharArray()){
			if(Character.isLetter(ch)) {
                		char base = Character.isLowerCase(ch) ? 'a':'A';
                		ans.append((char) ((ch - base + key) % 26 + base));
                }
                else ans.append(ch);
		}
           System.out.println(ans);
           sc.close();
	}
}