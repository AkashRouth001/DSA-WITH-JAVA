package gettersSetters;

public class gs {
    public static void main(String[]args){
        gs2 s = new gs2();
        s.name="akash";
        //s.roll=1; -> it gives error for privet
        //s.getRoll(); //->use to get
        s.setRoll(1);
        System.out.println(s.getRoll());


    }
}
