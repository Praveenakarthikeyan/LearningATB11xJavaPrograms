package ex_02_Operators;

public class Lab008_AssignmentOperator {
    public static void main(String[] args) {
        int a=20;
        int b = 5;

        // Using the simple assignment operator
        int c = a;
        System.out.println("c = a: " + c); // Output: 20

        // Using the addition assignment operator
        c += b;
        System.out.println("c += b: " + c); // Output: 25 (c = 20 + 5)

        // Using the subtraction assignment operator
        c -= b;
        System.out.println("c -= b: " + c); // Output: 20 (c = 25 - 5)

        // Using the multiplication assignment operator
        c *= b;
        System.out.println("c *= b: " + c); // Output: 100 (c = 20 * 5)

        // Using the division assignment operator
        c /= b;
        System.out.println("c /= b: " + c); // Output: 20 (c = 100 / 5)

        c %= b;
        System.out.println("c %= b:" + c);//Output: 0 (c = 20 % 5)


    }
}
