/*
a
bb
ccc
dddd
 */
public class q16_sameAlphaTri {
    public static void main(String[]args){
        int i,j;
        int n=4;
        for (i=0;i<n;i++){
           char ch=(char)('a'+i);
            for (j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
