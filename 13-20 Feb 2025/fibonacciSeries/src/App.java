public class App {
    public static void main(String[] args) throws Exception {
        int n =10;
        if (n == 0) System.out.println(0);
        if (n == 1) System.out.println(1);
        int n1 = 0, n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i <= n; i++) {
            n2 = n1 + (n1 = n2); 
            System.out.println(n2);
        } 
    }
}
