abstract class Animal{
    abstract void sound();

    public void walk(){
        System.out.println("it can walk");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("bow bow");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("maw maw");
    }
}

public class Abstraction {
    public static void main(String[]args){
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        d.walk();
        c.sound();
        c.walk();
    }
}
