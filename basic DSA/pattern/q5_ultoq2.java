import java.util.Scanner;

/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class q5_ultoq2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        int i,j;
        int n = sc.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
