// runtime polymorphism -> method overriding
class A{
    void x(){ System.out.println("Ax");}
    void y(){ System.out.println("Ay");}
}
class B extends A{
    void x(){ System.out.println("Bx");}
    void z(){ System.out.println("Bz");}
}


public class polymorphism {
    /*
    // compile time polymorphism -> over loading
    public static class car{
        int price;
        int speed;
        int id;
        String name;
        public void carType(int price){
            System.out.println("dam="+price);
        }
        public void carType(String name){
            System.out.println("name="+name);
        }
        public void carType(int speed,int id){
            System.out.println(speed+"km/h . id="+id);
        }
    }
    public static void main(String[]args){
        car c1 = new car();
        c1.name="bulate";
        c1.id=101;
        c1.speed=20;
        c1.price=900000;

        c1.carType(c1.price);
        c1.carType(c1.name);
        c1.carType(c1.speed, c1.id);

    } */


        public static void main(String[]args) {  // 'static' added here
            B b1 = new B();
            b1.x(); // Calls overridden method in class B -> "Bx"
            b1.y(); // Inherited from class A -> "Ay"
            b1.z(); // Method from class B -> "Bz"
            System.out.println("hululu");
            A a1 = new A();
            a1.x();

            A a2 = new B();
            a2.x();
        }

}
