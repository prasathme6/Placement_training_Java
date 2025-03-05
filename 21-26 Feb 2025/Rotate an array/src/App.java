import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
        int D = 2;
        int n = arr.length;
        for(int i=0;i<D;i++){
           int first= arr[0];
           for(int j=0;j<=n-2;j++){
                arr[j] = arr[j+1];
           }
           arr[n-1] = first;
        }
        System.out.println(Arrays.toString(arr));
        // int[] arr = {1,2,3,4,5};
        // int D =2;
        // int n = arr.length;
        // for(int i=0;i<D;i++){
        //    int last= arr[n-1];
        //    for(int j=n-1;j>=1;j--){
        //         arr[j] = arr[j-1];
        //    }
        //    arr[0] = last;
        // }
        // System.out.println(Arrays.toString(arr));
    }
}
