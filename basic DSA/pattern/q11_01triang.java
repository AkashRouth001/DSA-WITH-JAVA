/*
1
0 1
1 0 1
0 1 0 1
 */
public class q11_01triang {
    public static void main(String[]args){
        int i,j;
        int n=5;
        int s=1;
        for (i=0;i<n;i++){
            if (i%2==0){
                s=1;
            }
            else {
                s=0;
            }
            for (j=0;j<i;j++){
                System.out.print(s);
                s = 1-s;
            }
            System.out.println();
        }
    }
}
