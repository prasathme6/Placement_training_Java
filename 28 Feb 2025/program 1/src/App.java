import java.util.*; 
public class App {
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
        Arrays.sort(arr);
        if(arr[0] == arr[ind-3]) System.out.println("no max");
        else System.out.println("max "+arr[ind-3]);
        sc.close();
    }
}
