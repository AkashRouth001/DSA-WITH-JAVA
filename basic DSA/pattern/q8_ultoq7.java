import java.util.Scanner;

/*
* * * * *
  * * *
    *
 */
public class q8_ultoq7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lines num:");
        int i,j;
        //int n = sc.nextInt();
        int n =3;
        for (i =0;i<n;i++){
            // 1st space
            for (j=0;j<i;j++){
                System.out.print(" ");
            }
            // star
            for (j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            // 2nd space
            for (j=0;j<i;j++){
                System.out.print("");
            }
            System.out.println();
        }
    }

}
