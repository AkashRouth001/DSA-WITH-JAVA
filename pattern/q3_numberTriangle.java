import java.util.Scanner;

/*

 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5

 */
public class q3_numberTriangle {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        System.out.println("output:");
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
