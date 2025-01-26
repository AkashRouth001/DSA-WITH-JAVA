import java.util.Scanner;

public class N_number {
    static void num(int i,int n){
        if (i<=n){
            System.out.println(i);
        }
        num(i+1,n);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        num(1,n);
    }
}
