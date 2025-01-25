/*
Reverse a Number
 */
public class Reverse_Number {
    public static void main(String[]ars){
        int n=1234;
        int i,revnum=0,num;
        while (n>0){
            num = n%10;
            n=n/10;
            revnum = num+revnum*10;
        }
        System.out.print("revnumber is "+revnum);
    }
}
