public class unique_paths_lc62 {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        int[][] arr=new int[m][n];
        for(int r=0;r<m;r++){
            arr[r][n-1]=1;
        }
        for(int c=0;c<n;c++){
            arr[m-1][c]=1;
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                arr[i][j]=arr[i][j+1] + arr[i+1][j];
            }
        }
        System.out.println(arr[0][0]);
    }

}
