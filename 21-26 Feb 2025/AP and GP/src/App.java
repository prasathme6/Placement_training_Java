
//import java.util.*;
// AP
public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {6,10,14};
        int[] arr1 = {2,6,18};
        int diff = arr[arr.length-1]-arr[arr.length-2];
        int div = arr1[arr1.length-1]/arr1[arr1.length-2];
        int fin = diff;
        int gp = div;
        for(int i=0;i<=arr.length-2;i++){
            diff = arr[arr.length-i-1]-arr[arr.length-i-2];
            div = arr1[arr1.length-i-1]/arr1[arr1.length-i-2];
            if(fin == diff){
                continue;
            }
            if(gp == div){
                continue;
            }
        }
        System.out.println(arr[arr.length-1]+fin);
        System.out.println(arr1[arr1.length-1]*gp);
    }
}