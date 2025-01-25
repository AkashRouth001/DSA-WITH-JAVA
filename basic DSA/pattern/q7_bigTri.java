import java.util.Scanner;

/*
    *
  * * *
* * * * *
 */
public class q7_bigTri {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("enter the lines:");
        int n = sc.nextInt();

        for (i=1;i<=n;i++){
            //1st sapce
            for (j=1;j<=(n-i+1);j++){
                System.out.print(" ");
            }
            //star
            for (j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            //2nd sapce
            for (j=1;j<=(n-i+1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
