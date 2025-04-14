package JavaCodingQs;

import java.util.Scanner;

public class Q4_Age_Category {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = s.nextInt();

        if(age<13){
            System.out.println("child");
        } else if (age>=13 && age<=19) {
            System.out.println("Teenager");
        } else if (age<65) {
            System.out.println("Adult");
        }else
            System.out.println("Senior Citizen");

    }
}
