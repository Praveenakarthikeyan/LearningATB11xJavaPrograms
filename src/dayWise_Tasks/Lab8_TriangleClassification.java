package dayWise_Tasks;

import java.util.Scanner;

public class Lab8_TriangleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        if(l1==l2 && l1==l3 && l2==l3)
        {
            System.out.println("The triangle is equilateral");
        } else if (l1==l2|| l1==l3 || l2==l3)
        {
            System.out.println("The triangle is isosceles");
        }else
            System.out.println("The triangle is scalene");
    }
}
