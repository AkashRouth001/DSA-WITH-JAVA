/*
find the divisor of number
 */
public class divisor_of_num {
    public static void main(String[]args){
        int n=36;
        int i;
        /*// brout froce
        for (i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }

        }*/
        // optimal approch
        for (i=1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                System.out.println(i);
                if (n/i!=i){
                    System.out.println(n/i);
                }
            }
        }
    }
}
