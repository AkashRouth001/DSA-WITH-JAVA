/*
Factorial of a Number : Iterative and Recursive
 */
public class factorial {
    /*//Iterative
    static void fact(int n){
        int f=1;
        int i;
        for (i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("factorila is :"+f);
    }*/
    //Recursive
    static int fact(int n){
        if (n==0){
            return 1;
        }
        return n *fact(n-1);
    }

    public static void main(String[]args){
        int n =3;
        System.out.println(fact(n));
    }
}
