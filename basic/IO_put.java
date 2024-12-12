import  java.util.Scanner;
public class IO_put {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // for new input
        System.out.print("enter the numbers :");//print
        int num1= sc.nextInt();// take the input
        int num2= sc.nextInt();
        int sum= num2+num1;
        System.out.println("sum of two numbers "+sum); // print output
    }
}
