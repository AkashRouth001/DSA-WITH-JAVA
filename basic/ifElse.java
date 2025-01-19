import java.util.Scanner;

public class ifElse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age:");
        int age = sc.nextInt();

        if(age <18){
            System.out.println("you are a baby");
        } else if (age>18 && age<60) {
            System.out.println("you are a adulet");
        }
        else {
            System.out.println("you are a old");
        }
    }
}
