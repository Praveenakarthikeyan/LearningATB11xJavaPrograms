package ex_19_IIB;

public class Lab095_IIB {
    public static void main(String[] args) {
       Person p = new Person();
    }
}
class Person{
    {
        System.out.println("IIB statement");
    }
    Person(){
        System.out.println("Default Constructor");
    }
}