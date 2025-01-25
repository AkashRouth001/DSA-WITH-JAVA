/*
Check Palindrome =>
real number = reverce of (real number)
 */
public class Check_Palindrome {
    public static void main(String[]args){
        int n=1211;
        int revnum=0,rnum,num;
        rnum = n;
        while (n>0){
            num = n%10;
            n=n/10;
            revnum = revnum*10+num;
        }
        if (revnum == rnum){
            System.out.print("this is Palindrome :"+rnum);
        }
        else {
            System.out.print("this is not Palindrome :"+rnum);
        }
    }
}
