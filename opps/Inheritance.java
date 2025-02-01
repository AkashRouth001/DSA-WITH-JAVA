class Aa{ // parent class
    void p(){System.out.println("Ap");}
    void q(){System.out.println("Aq");}
}
class Bb extends Aa{ // single inheritance
    void p(){System.out.println("Bp");}
    void r(){System.out.println("Br");}
}
class Cc extends Bb{ // multtilavel inheritance
    void r(){System.out.println("Cr");}
    void s(){System.out.println("Cs");}
}

//hierarchial inheritance
class x extends Aa{
    void p(){System.out.println("xp");}
    void q1(){System.out.println("xq");}
}
class y  extends Aa{
    void p(){System.out.println("yp");}
    void q1(){System.out.println("yq");}
}
public class Inheritance {
    public static void main(String[]args){
        // ✅ Single Inheritance (Aa → Bb)
        Bb objB = new Bb();
        System.out.println("Single Inheritance:");
        objB.p(); // Overridden method in Bb
        objB.q(); // Inherited from Aa
        objB.r(); // Defined in Bb
        System.out.println();

        // ✅ Multilevel Inheritance (Aa → Bb → Cc)
        Cc objC = new Cc();
        System.out.println("Multilevel Inheritance:");
        objC.p(); // Overridden in Bb
        objC.q(); // Inherited from Aa
        objC.r(); // Overridden in Cc
        objC.s(); // Defined in Cc
        System.out.println();

        // ✅ Hierarchical Inheritance (Aa → x, Aa → y)
        x objX = new x();
        System.out.println("Hierarchical Inheritance (Aa → x):");
        objX.p();  // Overridden in x
        objX.q();  // Inherited from Aa
        objX.q1(); // Defined in x
        System.out.println();

        y objY = new y();
        System.out.println("Hierarchical Inheritance (Aa → y):");
        objY.p();  // Overridden in y
        objY.q();  // Inherited from Aa
        objY.q1(); // Defined in y
    }
}
