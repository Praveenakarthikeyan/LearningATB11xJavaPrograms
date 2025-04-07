package ex_14_OOPs_Polymorphism;

public class Lab085_MethodOverriding {
    public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();

    Cat c = new Cat();
    c.sound();
}
}
class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}
