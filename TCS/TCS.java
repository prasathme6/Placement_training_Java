// factorial without using multiply

//import java.util.*;
//public class TCS {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        System.out.println(fact(n));
//   }
//    static int fact(int n){
//        int dec = n;                    //11111=5     5555=20      202020=60      6060=120      120
//        int temp = 1;
//        while(dec>0){
//            int ans = 0;
//            for(int j=0;j<dec;j++){
//                ans+=temp;
//            }
//            temp = ans;
//            dec--;
//        }
//        return temp;
//    }
//}





// count max 1's in row

//import java.util.*;
//public class TCS {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        int[][] arr = new int[row][col];
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++) arr[i][j] = sc.nextInt();
//        }
//	     int max = 0;                 
//        for(int i=0;i<row;i++){
//	     	   int count = 0;
//            for(int j=0;j<col;j++) if(arr[i][j] == 1) count++;
//	     	   if(count > max) max = i;
//        }
//        System.out.println("max "+max);
//        sc.close();
//    }
//}





// word appearance

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String word = sc.nextLine();
//		String ser = sc.nextLine();
//		int ans = 0;
//		Map<Character,Integer> hash = new HashMap<>();
//		Set<Character> set = new HashSet<>();
//		for(char ch:word.toCharArray()) hash.put(ch,hash.getOrDefault(ch,0)+1);
//		for(char ch:ser.toCharArray()) set.add(ch);
//		for(char ch:set) ans += hash.get(ch);
//		System.out.println(ans);
//	}
//}






// good number

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int ref = n;
//		int ans = 0;
//		while(n!=0){
//			ans += n%10;
//			n/=10;
//		}
//		System.out.println(ref%ans==0 ? "good":"bad");
//	}
//}




// move 0 to last

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) arr[i] = sc.nextInt();           //1 2 0 3 4 0 5   ---->   1 2 3 4 5 0 0
//		for(int i=0;i<n;i++){
//			for(int j=i+1;j<n-i-1;j++){
//				if(arr[j] == 0){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		for(int i:arr) System.out.print(i+" ");
//	}
//}






// first non repeating element

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) arr[i] = sc.nextInt();           
//		Map<Integer,Integer> hash = new HashMap<>();
//		for(int i:arr) hash.put(i,hash.getOrDefault(i,0)+1);
//		for(int i:arr) {
//			if(hash.get(i) == 1){
//				System.out.println(i);
//				break;
//			}
//		}
//	}
//}









// left rotation

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) arr[i] = sc.nextInt();  	//		        1          
//		System.out.print("enter d:");         		//	1 2 3 4    ------>       2 3 4 1 
//		int d = sc.nextInt();
//		for(int i=0;i<d;i++){
//			int first = arr[0];
//			for(int j=0;j<arr.length-1;j++){
//				arr[j] = arr[j+1];
//			}
//			arr[arr.length-1] = first;
//		}
//		for(int i:arr) System.out.print(i+" ");
//	}
//}






// Equalibrium index        

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) arr[i] = sc.nextInt();  
//		for(int i=1;i<n-1;i++){
//			int mid = i;
//			int left = 0;
//			int right = 0;
//			for(int j=0;j<i;j++) left += arr[j];
//			for(int j=i+1;j<n;j++) right += arr[j];
//			if(left == right){
//				System.out.print(mid);
//				break;
//			}
//			if(mid == n-2 && left != right) System.out.print(-1);
//		}
//	}
//}
	








// right rotation

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) arr[i] = sc.nextInt();  	//		      1          
//		System.out.print("enter d:");         		//	1 2 3 4    ------>       4 1 2 3 
//		int d = sc.nextInt();
//		for(int i=0;i<d;i++){
//			int last = arr[arr.length-1];
//			for(int j=arr.length-2;j>=0;j--){
//				arr[j+1] = arr[j];
//			}
//			arr[0] = last;
//		}
//		for(int i:arr) System.out.print(i+" ");
//	}
//}








// array is subset of another array

//import java.util.*;
//public class TCS{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) arr[i] = sc.nextInt();  
//		int m = sc.nextInt();
//		int[] arr1 = new int[m];
//		for(int i=0;i<m;i++) arr1[i] = sc.nextInt(); 
//		Map<Integer,Integer> hash = new HashMap<>();
//		for(int i:arr) hash.put(i,hash.getOrDefault(i,0)+1);
//		boolean flag = true;
//		for(int i:arr1){
//			if(!hash.containsKey(i)){
//				flag = false;
//				break;
//			}
//		}
//		System.out.print(flag);
//	}
//}








// symmetry subset

//import java.util.*;
//public class TCS {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        int[][] arr = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) arr[i][j] = sc.nextInt();
//        }
//        Map<Integer, Integer> hash = new HashMap<>();
//        for (int[] i : arr) {
//            int first = i[0];
//            int second = i[1];
//            if (hash.containsKey(second) && hash.get(second) == first) System.out.println("(" + first + ", " + second + ")");
//            else hash.put(first, second);
//        }
//    }
//}








//vehicle
import java.util.*;
public class TCS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	int v = sc.nextInt();
        	int w = sc.nextInt();
		if (w % 2 != 0) {
            		System.out.println("enter valid input");
            		return;
        	}
		int t = w;
		int f = 0;
		while(t >= 0){
			if((t/2) + (f/4) == v){
				System.out.println((t/2) + " " +(f/4));
				return;
			}
			t-=4;
			f+=4;
		}
	}
}