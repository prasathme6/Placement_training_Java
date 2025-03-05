import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        System.out.println(n % 400 == 0 || n % 4 == 0 && n % 100 != 0 ? "Leap year" :"Not a leap year");
    }
}