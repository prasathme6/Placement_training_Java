// public class App {
//     public static void main(String[] args) throws Exception {
//         String a = "999999999999";
//         String b = "4444444";
//         int i = a.length()-1;
//         int j = b.length()-1;
//         int carry = 0;
//         StringBuilder ans = new StringBuilder();
//         while(i>=0 || j>=0 || carry> 0) {
//             int dig = (i>=0)?a.charAt(i) - '0':0;
//             int dig1 = (j>=0)?b.charAt(j) - '0':0;
//             int add = dig+dig1+carry;
//             carry = add/10;
//             ans.append(add%10);
//             i--;
//             j--;
//         }
//         System.out.println(ans.reverse());
//     }
// }









// public class App {
//     public static void main(String[] args) throws Exception {
//         int[] arr = {5,4,3,2,3,2};
//         for(int i =0 ;i<arr.length;i++){
//         boolean flag = true;
//             for(int j=1;j<arr.length;j++){
//                 if(i != j && arr[i] == arr[j]){
//                     flag = false;
//                     break;
//                 }
//             }
//         if(flag) System.out.print(arr[i]+" ");
//         }
//     }
// }






class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) { // Corrected loop condition
                int area = Math.min(height[i], height[j]) * (j - i); // Corrected area formula
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
