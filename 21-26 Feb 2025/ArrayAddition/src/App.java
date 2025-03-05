// import java.math.BigInteger;
// public class App {
//     public static void main(String[] args) throws Exception {
//         BigInteger a = new BigInteger("999999888888777777666666555555");
//         BigInteger b = new BigInteger("234567890123456789012345678901");
//         BigInteger c = a.add(b);
//         System.out.println(c);
//     }
// }









// import java.util.Arrays;

// public class App {
//     public static void main(String[] args) throws Exception {
//         int[] a = {2,3,4,5};
//         int[] b = {7,6,5,5};
//         int n = a.length;

//         int[] temp = new int[n+1];
//         int ans=0;
//         int carry=0;
//         for (int i = n-1; i >= 0; i--) {
//             ans = a[i] + b[i] + carry;
//             carry = ans/10;
//             temp[i+1] = ans % 10; 
//         }
//         temp[0] = carry;
//         System.out.println(Arrays.toString(temp));
//     }
// }











public class App {
    public static void main(String[] args) throws Exception {
        int[] a = {2,3,4,5,5};
        int[] b = {7,6,5,5};
        int n = a.length;
        int m = b.length;
        int maxlength = Math.max(n,m);

        int[] temp = new int[n+1];
        int ans=0;
        int carry=0;
        for (int i = 0; i < maxlength; i++) {
            int num1 = (n-1-i >= 0)?a[n-1-i]:0; 
            int num2 = (m-1-i >= 0)?b[m-1-i]:0;
            ans = num1 + num2 + carry;
            carry = ans/10;
            temp[i+1] = ans % 10; 
        }
        temp[0] = carry;
        System.out.print("[");
        for(int i=temp.length-1;i>=1;i--){
            System.out.print(temp[i]+" ");
        }
        System.out.println("]");
    }
}
