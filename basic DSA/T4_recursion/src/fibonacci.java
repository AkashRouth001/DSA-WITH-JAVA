public class fibonacci {
    static int fibo(int n){
        if(n<=1) return n;
        int fst = fibo(n-2);
        int snd  = fibo(n-1);
        return fst+snd;
    }
    public static void main(String []args){
        int n =3;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
