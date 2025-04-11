package dayWise_Tasks.OOPS_Inheritance;

public class Lab26_Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();

        Cat cat = new Cat();
        cat.sound();
        cat.eat();

        Cow cow = new Cow();
        cow.sound();
        cow.eat();
    }
}

// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

// Child class 3
class Cow extends Animal {
    void sound() {
        System.out.println("Cow says: Moo Moo!");
    }
}