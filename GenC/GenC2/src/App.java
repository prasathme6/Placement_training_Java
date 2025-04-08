import java.util.*;
public class App {
    static String[] res = new String[100];
    static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        StringBuilder path = new StringBuilder();
        decode(n, 0, path);
        for(int i=0;i<count;i++){
            System.out.println(res[i]);
        }
    }
    static void decode(String n,int index,StringBuilder path){
        if(index == n.length()){
            res[count++] = path.toString();
            return;
        }
        char ch = n.charAt(index);
        if(ch != '0'){
            int num = ch - '0';
            char let = (char) ('a'+num-1);
            path.append(let);
            decode(n, index+1, path);
            path.deleteCharAt(path.length()-1);
        }
        if(index+1 < n.length()){
            String twoDig = n.substring(index, index+2);
            int num2 = Integer.parseInt(twoDig);
            if(num2 >= 10 && num2 <= 26){
                char numOf2 = (char)('a'+num2-1);
                path.append(numOf2);
                decode(n, index+2, path);
                path.deleteCharAt(path.length()-1);
            }
        }
    }
}














    //for(int i=0;i<count-1;i++){
    //     for(int j=i+1;j<count;j++){
    //         if(res[i].compareTo(res[j])> 0){
    //             String temp = res[i];
    //             res[i] = res[j];
    //             res[j] = temp;
    //         }
    //     }
    // }