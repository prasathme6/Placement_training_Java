// boundary value
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = 1;
            }
        }
        int value = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i == 0 || j == 0 || i == row-1 || j == col-1){
                    System.out.print(arr[i][j]+ " ");
                    value += arr[i][j];
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println(value);
        sc.close();
    }
} 










// //How many sorted row in the matrix
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         System.out.println();
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         // ASC and DESC
//         int count = 0;
//         for(int i=0;i<row;i++){
//         boolean isAsc =true, isDsc = true;
//             for(int j=0;j<col-1;j++){
//                 if(arr[i][j] > arr[i][j+1]){
//                     isAsc = false;
//                 } 
//                 if(arr[i][j] < arr[i][j+1]){
//                     isDsc = false;
//                 } 
//             }
//             if(isAsc) count+=1;
//             if(isDsc) count+=1;                        
//         }
//         System.out.println(count == 0?"Zero sorted array":count);
//         // add  Diagonal elements
//         int primary = 0,secondary = 0;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(i==j){
//                     primary += arr[i][j];
//                 }
//                 if(i+j == col-1){
//                     secondary += arr[i][j];
//                 }
//             }
//         }
//         System.out.println(primary+" "+secondary);
//         sc.close();
//     }
// } 










// //Transpose is also equal to normal or not
// import java.util.*;
// public class App {
//     static int findMax(int[][] matrix, int row,int col){
//         int max = 0;
//         int value = 0;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(matrix[j][i] > max){
//                     max = matrix[j][i];
//                 }
//             }
//             value += max;
//             max= 0;
//         }
//         return value;
//     }
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         System.out.println();
//         int[][] arr = new int[row][col];
//         int[][] temp = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println();
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 temp[i][j] = arr[j][i];
//             }
//         }
//         int value = findMax(arr, row, col);
//         int value1 = findMax(temp, row, col);

//         for(int[] r:arr){
//             System.out.println(Arrays.toString(r));
//         }
//         System.out.println();
//         for(int[] p:temp){
//             System.out.println(Arrays.toString(p));
//         }
//         System.out.println(value == value1 ? "Yes" : "No");
//         sc.close();
//     }
// } 










// // count the specific number and replace it
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         System.out.println();
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println();
//         int input = sc.nextInt();
//         int count = 0;
//         int replaceEle = 7;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(arr[i][j] == input){
//                     count += 1;
//                     arr[i][j] = replaceEle;
//                 }
//             }
//         }
//         System.out.println("count= " + count);
//         for(int[] r:arr){
//             System.out.println(Arrays.toString(r));
//         }
//         sc.close();
//     }
// } 










//Add all diagonal element
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         System.out.println();
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         sc.close();
//         System.out.println();
//         int fDia = 0;
//         int lDia = 0;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(i == j){
//                     fDia += arr[i][j];
//                 } 
//             }
//         }
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(i+j == row-1){
//                     lDia += arr[i][j];
//                 }
//             }
//         }
//         System.out.println(fDia + " " + lDia);
//     }
// } 









// // Find the saddle point (min in row but max in column)
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         System.out.println();
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         sc.close();
//         System.out.println();
//         boolean found = false;
//         for(int i=0;i<arr.length;i++){
//             int min = arr[i][0];
//             int minInd = 0;
//             for(int j=0;j<arr[i].length;j++){      
//                 if(arr[i][j] < min){
//                     min = arr[i][j];
//                     minInd = j;
//                 }
//             }   
//             boolean isSaddle = true;
//             for(int k=0;k<row;k++){
//                 if(arr[k][minInd] > min){
//                     isSaddle = false;
//                     break;
//                 }
//             }
//             if(isSaddle){
//                 System.out.println("saddle point is " + min);
//                 found = true;
//                 break;
//             }
//         }
//         if(!found) System.out.println("No saddle point found");
//     }
// }









// //Matrix multiplication
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row1 = sc.nextInt();
//         int col1 = sc.nextInt();
//         System.out.println();
//         int[][] a = new int[row1][col1];
//         for(int i=0;i<row1;i++){
//             for(int j=0;j<col1;j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println();
//         int row2 = sc.nextInt();
//         int col2 = sc.nextInt();
//         System.out.println();
//         int[][] b = new int[row2][col2];
//         for(int i=0;i<row2;i++){
//             for(int j=0;j<col2;j++){
//                 b[i][j] = sc.nextInt();
//             }
//         }
//         int[][] c = new int[row1][col2];
//         sc.close();
//         if(col1 == row2){
//             for(int i=0;i<row1;i++){
//                 for(int j=0;j<col2;j++){
//                     for(int k=0;k<row2;k++){
//                         c[i][j] += a[i][k]*b[k][j];
//                     }
//                 }
//             }
//             for(int[] r:c){
//                 System.out.println(Arrays.toString(r));
//             }
//         }
//         else{
//             System.out.println("Unable to perform matrix multiplication.");
//         }
//     }
// }












// Max value in Each Row
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         System.out.println();
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         sc.close();
//         System.out.println();
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){       //arr[i].length
//                 if(arr[i][j] > max){
//                     max = arr[i][j];
//                 }
//             } 
//             System.out.println(max);
//             max = Integer.MIN_VALUE;
//         }
//     }
// }








// Count frequently occured element
// public class App {
//     public static void main(String[] args) throws Exception {
//         int[][] arr = {
//                 {7,4,7,9},
//                 {7,4,7,6},
//                 {7,7,7,4}
//         };
//         int[] nums = {0,1,2,3,4,5,6,7,8,9};
//         int count = 0;
//         int max = 0;
//         int[] ans=new int[nums.length];
//         int newSize = 0;
//         for(int num=0;num<nums.length;num++){
//             for(int i=0;i<arr.length;i++){
//                 for(int j=0;j<arr[i].length;j++){
//                     if(arr[i][j] == nums[num]){
//                         count += 1;
//                     }
//                 }
//             }
//             max = count;
//             ans[newSize] = max;
//             newSize+=1;
//             count = 0;
//         }
//         int maxTime = 0;
//         int index = 0;
//         for(int i=0;i<ans.length;i++){
//             if(ans[i] > maxTime){
//                 maxTime = ans[i]; 
//                 index = i;               
//             }
//         }
//         System.out.println(index);
//     }
// }










// count maximum number of 1s in Which row
// public class App {
//     public static void main(String[] args) throws Exception {
//         int[][] arr = {
//                 {1,2,4,1},
//                 {1,1,1,1},
//                 {1,2,1,8}
//         };
//         int count = 0;
//         int max = 0;
//         int[] ans=new int[4];
//         int newSize = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){       //arr[i].length
//                 if(arr[i][j] == 1){
//                     count += 1;
//                 }
//             }
//             if(count >= max) {
//                 max = count;
//                 ans[newSize] = i+1;
//                 newSize+=1;
//             }
//             count = 0;
//         }
//         for(int i=0;i<newSize;i++){
//             System.out.print(ans[i] + " ");
//         }
//     }
// }











// 2D array with tables..
// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int[][] arr = new int[row][col];
//         sc.close();
//         //int mul = 1;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j]=(j+1)*(i+1);
//             }
//             //mul+=1;
//         }
//         for(int[] r:arr){
//             System.out.println(Arrays.toString(r));
//         }
//     }
// }










// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int l = sc.nextInt();
//         int[][] arr = new int[l][l];
//         int ntr = sc.nextInt();
//         System.out.println();
//         sc.close();
//         int k=1;
//         for(int i=0;i<s;i++){
//             for(int j=0;j<s;j++){
//                 arr[i][j]=k;

//                 k+=1;
//             }
//         }
//         for(int i=0;i<l;i++){
//             for(int j=0;j<l;j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         for(int p=0;p<ntr;p++){
//             for(int i=0;i<l;i++){
//                 int last = arr[i][arr[i].length-1];
//                 for(int j=arr[i].length-1;j>0;j--){
//                     arr[i][j] = arr[i][j-1];
//                 }
//                 arr[i][0] = last;
//             }
//         }
//         System.out.println();
//         for(int i=0;i<l;i++){
//             for(int j=0;j<l;j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
