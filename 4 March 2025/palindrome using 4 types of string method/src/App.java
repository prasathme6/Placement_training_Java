// public class App {
//     public static void main(String[] args) throws Exception {
//         String s = "abca";
//         if(s.equals(usingString(s))) System.out.println("palindrome using string");
//         else System.out.println("not a palindrome by using string");
//         if(s.equals(usingStringBuilder(s))) System.out.println("palindrome using builder");
//         else System.out.println("not a palindrome by using string builder");
//         if(s.equals(usingStringBuffer(s))) System.out.println("palindrome using buffer");
//         else System.out.println("not a palindrome by using string buffer");
//         if(s.equals(usingWithoutBuildIn(s))) System.out.println("palindrome without using buildin func");
//         else System.out.println("not a palindrome by without using string method");
//     }
//     static String usingString(String s){
//         String a = "";
//         for(int i=s.length()-1;i>=0;i--){
//             a+=s.charAt(i);
//         }
//         return a;
//     }
//     static String usingStringBuilder(String s){
//         StringBuilder a = new StringBuilder(s);
//         return a.reverse().toString();
//     }
//     static String usingStringBuffer(String s){
//         StringBuffer a = new StringBuffer(s);
//         return a.reverse().toString();
//     }
//     static String usingWithoutBuildIn(String s){
//         char[] c = new char[s.length()];
//         for(int i=0;i<s.length();i++){
//             c[s.length() - 1 - i] = s.charAt(i);
//         }
//         return new String(c);
//     }
// }










public class App{
    public static void main(String args[]){
        String s = "Example";
        System.out.println(usingString(s));
        System.out.println(usingStringBuilder(s));
        System.out.println(usingStringBuffer(s));
    }
    static String usingString(String s){
        return s.substring(0,4);
    }
    static String usingStringBuilder(String s){
        StringBuilder a = new StringBuilder(s);
        return a.substring(3,6);
    }
    static String usingStringBuffer(String s){
        StringBuffer a = new StringBuffer(s);
        return a.substring(1,5);
    }
}