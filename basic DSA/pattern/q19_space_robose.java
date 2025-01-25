/*
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
 */
public class q19_space_robose {
    public static void main(String[]args){
        int i,j;
        int n=5;
        //uper
        for (i=0;i<n;i++){
            for (j=0;j<n-i;j++){
                System.out.print("*");
            }
            for (j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for (j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for (i =1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            for (j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
