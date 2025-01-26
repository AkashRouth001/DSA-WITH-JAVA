/*
String is Palindrome
 */
public class String_Palindrome {
    /*static boolean isPalin1(String s){
        int left =0,right=s.length()-1;
        while(left<right){
            char l = s.charAt(left),r=s.charAt(right);
            if (!Character.isLetterOrDigit(l)){
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else if (Character.toLowerCase(l)!=Character.toLowerCase(r)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }*/
    static boolean isPalin(int i,String s){
        if(i>=(s.length()-1-i)) return true;
        if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        return isPalin(i+1,s);
    }
    public static void main(String[]args){
        String s ="eye";
        //boolean ans = isPalin1(s);
        boolean ans = isPalin(0,s);
        if (ans==true){
            System.out.println("this is Palindrome");
        }
        else System.out.println("this is not Palindrome");
    }
}
