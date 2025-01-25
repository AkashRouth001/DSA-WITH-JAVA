/*
abc
ab
a
 */
public class q15_ultoq14 {
    public static void main(String[]args){
        int i,j;
        int n=4;
        char ch;
        for (i = 1;i<=n;i++){
            for (ch='a';ch<='a'+(n-i-1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
