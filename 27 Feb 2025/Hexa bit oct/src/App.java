import java.util.*;
public class App {
    static int octal(int n){
        int ans=0;
        int inc = 1;
        while(n != 0){
             int mod = n%8;
             int div = n/8;
             n = div;
             ans += mod*inc;
             inc*=10;
        }
        return ans;
    }
    static int bin(int n){
        int ans=0;
        int inc = 1;
        while(n != 0){
             int mod = n%2;
             int div = n/2;
             n = div;
             ans += mod*inc;
             inc*=10;
        }
        return ans;
    }
    static String hex(int n){
        String ans="";
        char hex;
        while(n != 0){
             int mod = n%16;
             int div = n/16;
             n = div;
             if(mod < 10){
                hex = (char)('0'+mod);
             }
             else{
                hex = (char)('A'+(mod-10));
             }
             ans+=hex;
        }
        String mainAns="";
        for(int i=ans.length()-1;i>=0;i--){
            mainAns += ans.charAt(i);
        }
        return mainAns;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(octal(n));
        System.out.println(bin(n));
        System.out.println(hex(n));
        sc.close();
    }
}