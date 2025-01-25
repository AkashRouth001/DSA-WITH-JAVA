import java.util.*;
public class array_io {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size :");
        int s=sc.nextInt(); // take the size
        int [] array = new int[s]; // declear array
        for(int i =0;i<s;i++){
            array[i] = sc.nextInt(); // take input of array
        }
        System.out.print("this is output:");
        //print array
        for (int i =0;i<s;i++){
            System.out.println(array[i]);
        }
    }
}
