package ex_24_Generics;

public class Lab110_Generics {
    public static void main(String[] args) {
        System.out.println(temp_sum(5,7));
        System.out.println(temp_sum(6.5,8.3));
        System.out.println(temp_sum("Seyon","Minnoli"));
    }

    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}
