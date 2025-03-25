package ex_06_IfStatement;

import java.util.Scanner;

public class Lab030_If_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Eligible to vote");
        }else
            System.out.println("Not eligible to vote");
    }
}
