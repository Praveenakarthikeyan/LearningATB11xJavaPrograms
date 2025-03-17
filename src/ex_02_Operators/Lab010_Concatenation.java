package ex_02_Operators;

public class Lab010_Concatenation {
    public static void main(String[] args) {
        String fname="Praveena";
        String lname="Karthikeyan";
        System.out.println(fname + lname);
        int a = 10;
        int b = 10;
        System.out.println(a+b + fname + lname);
        System.out.println(fname + lname + a+b);
        System.out.println(fname + lname + (a+b));
    }
}
