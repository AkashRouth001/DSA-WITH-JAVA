/*
1
2 3
4 5 6
7 8 9 10
 */
import java.util.Scanner;

public class q13_numTri {
    public static void main(String[]args){
        int i,j;
        int num=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the line");
        int n = sc.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
}
