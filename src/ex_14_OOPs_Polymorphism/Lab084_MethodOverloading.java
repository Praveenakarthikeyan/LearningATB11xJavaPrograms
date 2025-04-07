package ex_14_OOPs_Polymorphism;

public class Lab084_MethodOverloading {
    public static void main(String[] args) {
Calculator c1 = new Calculator();
        int n1 = c1.add(5,5);
        int n2 = c1.add(5,10,15);
        double n3 = c1.add(6.5,7.8);
        System.out.println(n1+" || "+n2+" || "+n3);
    }
}

class Calculator{

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }


}
