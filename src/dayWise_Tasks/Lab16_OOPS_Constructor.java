package dayWise_Tasks;

public class Lab16_OOPS_Constructor {
    public static void main(String[] args) {
        Person1 p1= new Person1();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.address);
        System.out.println(p1.isMale);

        Person1 p2 = new Person1("Minnoli",15);
        System.out.println(p2.name);
        System.out.println(p2.age);

        p1.eat();
        p1.sleep();
        p1.walk();
        p1.doHomeWork();
    }
}
 class Person1{
  String name;
  int age;
  String address;
  boolean isMale;

  Person1(){
      name="Seyon";
      age=20;
      address="2nd street,chennai";
      isMale=true;

  }

  Person1(String name,int age){
      this.name=name;
      this.age=age;
  }

     void eat(){
         System.out.println(this.name + " is eating");
     }

     void sleep(){
         System.out.println(this.name + " is sleeping");
     }

     void walk(){
         System.out.println(this.name + " is walking");
     }

     void doHomeWork(){
         System.out.println(this.name + " is doing Homework");
     }
 }
