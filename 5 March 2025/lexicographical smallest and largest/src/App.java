// public class App {
//     public static void main(String[] args) throws Exception {
//         String s = "java 2"; // ack ker    java 2      av va
//         String num = "";
//         for(int i=s.length()-1;i>=0;i--){
//             if(Character.isDigit(s.charAt(i))){
//                 num += (s.charAt(i));
//             }
//             else break;
//         }
//         int nums = Integer.parseInt(num);

//         System.out.print((s.substring(1, nums+1))+" "+(s.substring(nums, nums+nums)));
//     }
// }







class App{
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("abdgf");
        int count = 0;
        for(int i=0;i<s.length()/2;i++){
            if(!(s.charAt(i) == s.charAt(s.length()-1-i))){
                count += 1;
                s.setCharAt(s.length()-1-i , s.charAt(i));
            }
        }
        System.out.println(count);
        System.out.println(s);
    }
}

