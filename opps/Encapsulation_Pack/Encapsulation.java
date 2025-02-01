package Encapsulation_Pack;

import Encapsulation_Pack2.Encapsulation2; // for different package

public class Encapsulation {
    public static void main(String[]args){
        encap1 s = new encap1();
        s.name="akash";
        s.roll=1;
        s.marks=99.9;
        System.out.println(s.name);
        Encapsulation2 s2 = new Encapsulation2();
        s2.id=1002;
        System.out.println(s2.id);

    }
}
