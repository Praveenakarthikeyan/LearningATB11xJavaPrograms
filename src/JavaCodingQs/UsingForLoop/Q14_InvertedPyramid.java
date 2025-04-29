package JavaCodingQs.UsingForLoop;

import java.util.Scanner;

public class Q14_InvertedPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int n = sc.nextInt();
        //i=5,spaces=0,stars=9,spaces=5-i,stars=2*i-1
        //i=4,spaces=1,stars=7,
        //i=3,spaces=2,stars=5
        //i=2,spaces=3,stars=3
        //i=1,spaces=4,stars=1

        for(int i=5;i>=1;i--){
            for(int j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
