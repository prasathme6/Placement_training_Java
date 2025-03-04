import java.util.Scanner;
public class App {
    static String repeatFunc(String repeat, int repeatTimes){
        String result = "";
        for(int i=0;i<repeatTimes;i++){
            result += repeat;
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() ;
        sc.close();
        String ans ="";
        String repeat = "";
        String strnum = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(!strnum.isEmpty()){
                    int repeatTimes = Integer.parseInt(strnum);
                    ans += repeatFunc(repeat, repeatTimes);
                    strnum = "";
                    repeat = "";
                }
                repeat += Character.toString(ch);
            }
            else if(Character.isDigit(ch)) strnum = Character.toString(ch);
        }
        if (strnum.isEmpty()) strnum = "1";
        int repeatTimes = Integer.parseInt(strnum);
        ans += repeatFunc(repeat, repeatTimes);
        
        System.out.println(ans);
    }
}
