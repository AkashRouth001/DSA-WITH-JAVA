/*
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
 */
public class q12_ultoSpaceTri {
    public static void main(String[]args){
        int i,j;
        int n=4;
        for(i=1;i<=n;i++){
            // 1st number
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for (j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // 2nd number
            for (j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
