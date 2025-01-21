import java.util.Scanner;

public class loops {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // for loop
        System.out.println("this is for loop:");
        int fl = 5;
        int i ;
        for(i=1;i<=fl;i++){
            System.out.println(i);
        }

        // while loop
        System.out.println("this is while  loop:");
        int wh = 5;
        int iw =1;
        while(iw<=wh){
            System.out.println(iw);
            iw++;
        }

        // do while loop
        System.out.println("this is do while  loop:");
        int dwh = 5;
        int idw =1;
        do {
            System.out.println(idw);
            idw++;
        }while (idw<=dwh);
    }
}
