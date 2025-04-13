package ex_23_Exceptions;

import java.util.Scanner;

public class Lab109_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void validateAge(int age) throws ArithmeticException, NullPointerException, Exception {
        if (age < 18) {
            throw new Exception("You can't go, else you will be out of the house");
        }

    }
}
