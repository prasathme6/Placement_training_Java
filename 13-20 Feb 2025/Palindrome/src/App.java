public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(nextpalindrome(808));
    }
    static int nextpalindrome(int num) {
        int ref = num;
        int ans = 0;
        int n;
        while (num != 0) {
            n = num % 10;
            ans = ans * 10 + n;
            num /= 10;
        }
        return ans;
    }
}







// public class App {
// public static void main(String[] args) throws Exception {
// int[] arr = {8,0,8};
// boolean flag=true;
// for(int i = 0 ; i <= arr.length/2 ; i++){
// if(arr[i] != arr[arr.length-i-1]){
// flag = false;
// break;
// }
// }
// System.out.println(flag?"yes":"no");
// }
// }

// public class App {
// public static void main(String[] args) throws Exception {
// char[] arr = {'a','b','c','b','a'};
// boolean flag=true;
// for(int i = 0 ; i <= arr.length/2 ; i++){
// if(arr[i] == arr[arr.length-i-1]){
// continue;
// }
// else{
// flag = false;
// }
// }
// System.out.println(flag?"yes":"no");
// }
// }
