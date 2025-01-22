import java.util.Scanner;

/*

        *
        * *
        * * *
        * * * *
        * * * * * ->n
        * * * *
        * * *
        * *
        *

        */
public class q10_q2andq5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        int i,j;
        int n = sc.nextInt();
        for (i =1;i<=2*n-1;i++){
            int s=i;
            if (i>n) s = 2*n-i ;
            for (j=1;j<=s;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
