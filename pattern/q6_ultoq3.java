import java.util.Scanner;

/*
1 2 3 4
1 2 3
1 2
1
 */
public class q6_ultoq3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num :");
        int n = sc.nextInt();
        int i,j;
        for (i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
