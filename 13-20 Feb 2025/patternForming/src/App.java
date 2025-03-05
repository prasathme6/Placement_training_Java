public class App {
    public static void main(String[] args) throws Exception {
        int x = 123456789;
        int last;
        int even = 0;
        int odd = 0;
        while(x != 0){
            last = x % 10;
            if(last % 2 == 0){
                even = even * 10 + last;
            }
            else{
                odd = odd * 10 + last;
            }
            x /= 10;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}








// public class App {
//     public static void main(String[] args) throws Exception {
//         int x = 123456789;
//         int last;
//         int even = 0;
//         int odd = 0;
//         int evenInc = 1;
//         int oddInc = 1;
//         while(x != 0){
//             last = x % 10;
//             if(last % 2 == 0){
//                 even += (last * evenInc);
//                 evenInc *= 10;
//             }
//             else{
//                 odd += (last * oddInc);
//                 oddInc *= 10;
//             }
//             x /= 10;
//         }
//         System.out.println(odd);
//         System.out.println(even);
//     }
// }
