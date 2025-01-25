/*
Armstrong Numbers=>
153=1^3+5^3+3^3
 */
public class Armstrong_Numbers {
    public static void main(String[]args){
        int n =1538;
        int real_num,num,amst=0;
        real_num = n;
        while(n>0){
            num = n%10;
            amst = amst+ num*num*num;
            n = n/10;
        }
        if (real_num==amst){
            System.out.print("this is armstrom:");
        }
        else System.out.print("this is not armstrom:");

    }
}
