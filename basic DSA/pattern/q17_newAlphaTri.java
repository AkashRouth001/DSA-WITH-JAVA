/*
   a
  aba
 abcba
abcdcba
 */
public class q17_newAlphaTri {
    public static void main(String[]args){
        int i,j;
        int n=4;
        char ch;
        for (i=1;i<=n;i++){
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            ch = 'a';
            for (j=1;j<=2*i-1;j++){
                System.out.print(ch);
                if (j<i){
                    ch++;
                }
                else {
                    ch--;
                }
            }
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
