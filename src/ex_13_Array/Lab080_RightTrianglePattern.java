package ex_13_Array;

import java.util.Scanner;

public class Lab080_RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int n = sc.nextInt();
        //i=i, stars=1
        //i=2, stars=2
        //i=3, stars=3
        //i=4, stars=4
        //i=5, stars=5

        for(int i=1; i<=n;i++){
           for(int j=1;j<=i;j++) {
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
