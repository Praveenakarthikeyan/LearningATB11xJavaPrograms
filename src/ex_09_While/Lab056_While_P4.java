package ex_09_While;

import java.util.Scanner;

public class Lab056_While_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =sc.nextInt();
        int factorial=1;
        while(num>0){
            factorial=factorial*num;
            num--;
        }
        System.out.println("The factorial of number is" + factorial);
        sc.close();
    }
}
