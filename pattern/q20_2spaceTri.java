/*
 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                 *
 */
public class q20_2spaceTri {
    public static void main(String[]args){
        int i,j;
        int n=5;
        int st;
        int sp = 2*(n-1);
        for (i=1;i<=2*n-1;i++){
            //star
            st = i;
            if (i>n){st=2*n-i;}
            for (j=1;j<=st;j++){
                System.out.print("*");
            }
            // space
            for (j=1;j<=sp;j++){
                System.out.print(" ");
            }
            //star
            if (i>n){st=2*n-i;}
            for (j=1;j<=st;j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<n){sp = sp-2;}
            else{sp=sp+2;}
        }
    }
}
