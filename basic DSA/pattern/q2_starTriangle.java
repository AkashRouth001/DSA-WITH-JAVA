import java.util.Scanner;

/*

 *
 * *
 * * *
 * * * *
 * * * * *

 */
public class q2_starTriangle {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        System.out.println("output:");
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
