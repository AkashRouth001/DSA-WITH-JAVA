import java.util.Scanner;

/*
count the digit of the number
 */
public class Count_Digit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("enter the number");
        int n = sc.nextInt();
       /*
       count =0;
       Brute Force Approach:
        while (n>0){
            count ++;
            n =n/10;
        }*/
        // optimal approch:
        count = (int) (Math.log10(n)+1);

        System.out.print("digit number:"+count);
    }
}
