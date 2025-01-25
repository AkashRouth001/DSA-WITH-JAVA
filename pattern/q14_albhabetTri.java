/*
a
a b
a b c
a b c d
 */
public class q14_albhabetTri {
    public static void main(String[]args){
        int i,j;
        int n=4;
        char ch;
        for (i=0;i<n;i++){
            for (ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
