/*
Sum of first N Natural Numbers
 */
public class sum_of_n {
    static void sum(int n){
        int s=0;
        for (int i=1;i<=n;i++){
            s=s+i;
        }
        System.out.println("sum="+s);
    }
    public static void main(String[]args){
        int n=5;
        sum(n);
    }
}
