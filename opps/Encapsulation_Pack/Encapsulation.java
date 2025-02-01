package Encapsulation_Pack;
class Animal{
    public void sound(){};

    public void walk(){
        System.out.println("it can walk");
    }
}

class Dog extends Animal {
    public void sound(){
        System.out.println("bow bow");
    }
}
class Cat extends Animal {
    public void sound(){
        System.out.println("maw maw");
    }
}
public class Encapsulation {
}
