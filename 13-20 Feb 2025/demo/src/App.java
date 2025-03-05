import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int R;
        int reverse = 0;
            
        while(n!=0){
            R = n % 10;
            reverse = reverse*10+R;
            n = n/10;
        }    
        System.out.println(reverse);
        sc.close(); 
    }
}