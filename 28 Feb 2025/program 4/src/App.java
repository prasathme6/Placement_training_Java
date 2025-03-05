import java.util.*;
public class App {
    static boolean abundant(int n){
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) sum += i;
        }
        return sum>n;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[row * col];
        int ind = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[ind] = a[i][j];
                ind += 1;
            }
        }
        int count = 0;
        for(int i=0;i<ind;i++){
            if(abundant(arr[i]))
            count+=1;
        }
        if(count%2==0) System.out.println("yes");
        else System.out.println("no");
        sc.close();
    }
}
