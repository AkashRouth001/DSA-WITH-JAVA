public class gcd {
    public static void main(String[]args){
        int a=9,b=12;
        int i;
        /*
        // bf
        for (i=Math.min(a,b);i>=1;i--){
            if (a%i==0&&b%i==0){
                System.out.println(i);
                break;
            }
        }*/
        // The Euclidean Algorithm
        while (a>0&b>0){
            if(a>b){a=a%b;}
            else b=b%a;
        }
        if (a==0){System.out.println(b);}
        else {System.out.println(a);}
    }
}
