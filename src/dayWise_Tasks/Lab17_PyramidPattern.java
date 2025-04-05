package dayWise_Tasks;

import java.util.Scanner;

public class Lab17_PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int n= sc.nextInt();

        //i=1, spaces=4,stars=1 , spaces=n-i, stars=2*i-1
        //i=2, spaces=3,stars=3
        //i=3, spaces=2,stars=5
        //i=4, spaces=1,stars=7
        //i=5, spaces=0,stars=9

        //outer for loop
        for(int i=1;i<=n;i++){
            //print spaces
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //inner for loop
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
