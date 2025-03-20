package dayWise_Tasks;

import java.util.Scanner;

public class Lab9_FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibonacci number: ");
        int n = sc.nextInt();

        int f0=-1,f1=1;
        for(int i=0;i<n;i++)
        {
            int fn=f0+f1;
            System.out.println("series is: " +fn);
            f0=f1;
            f1=fn;
        }

    }
}
