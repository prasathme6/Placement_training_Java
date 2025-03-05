import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = {2,4,3,5,3,7,30,0};
        int m = a.length;
        int[] b = {1,3,4};
        int n = b.length;
        for(int i=0;i<n;i++){
            a[m-i-1] = b[i];
        }
        for(int i = 0 ; i < m-1 ; i++){
            boolean swapped = false;
            for(int j = 0 ; j < m-i-1 ; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(a));
    }
}
