public class data_type {
    public static void main(String[]args){
        /*
        data type in java
        i)primitive :
           1> non numerical: boolean , char
           2>numerical:
                a)integer : byte,short,int,long
                b)floating: float,double
        ii)non primitive: String,array
        */
        // non numerical
        boolean b = false;
        char c = 'a';// only 1 letter
        //numerical
        //integer
        byte by = 1;
        byte by1 = 123;//byte can hold values from -128 to 127 (inclusive).
         //byte by = 12345; -> it gives error
        //floating:
        float f = 1.2f;//upto 7 decimal digits
        double d =1.2;//upto 16 decimal digits
        //non primitive:
        String s = "akash r";

        // print
        System.out.println("boolean:"+b);
        System.out.println("char:"+c);
        System.out.println("byte:"+by);
        System.out.println("float:"+f);
        System.out.println("double:"+d);
        System.out.println("string:"+s);


        // type casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("this is type casting:");
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}
