public class App {
    public static void main(String[] args) throws Exception {
        int n = 5;
        for(int i=0;i<3;i++){
            for(int j=n;j>=1;j--){
                if(i==0 && (j==n || j==1) || i==1 && (j==2 || j==n-1) || i==2 && j==n-2 )
                System.out.print(j+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=1;j<=n;j++){
                if(i==0 && (j==2 || j==n-1)|| i==1 && (j==1 || j==n))
                System.out.print(j+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
