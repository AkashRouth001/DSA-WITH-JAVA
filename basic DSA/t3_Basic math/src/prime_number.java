public class prime_number {
    public static void main(String[]args){
        int i;
        int n=5;
        int count =0;
        //Brute Force Approach
       /* for(i=1;i<=n;i++){
            if(n%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("this is prime");
        }
        else System.out.println("this is not prime");*/

        // optimal approch
        for (i=1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                count++;
                if ((n/i)!=i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("this is prime");
        }
        else System.out.println("this is not prime");
    }
}
