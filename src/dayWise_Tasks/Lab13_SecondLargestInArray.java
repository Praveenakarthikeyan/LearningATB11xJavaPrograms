package dayWise_Tasks;

import java.util.Scanner;

public class Lab13_SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int size=sc.nextInt();
        int num[] = new int[size];
       //[25,30,57,14,27,78]

        for(int i=0;i<size;i++){
           num[i]=sc.nextInt();
        }
         int max = Integer.MIN_VALUE;// to handle negative numbers.
        int secondMax = Integer.MIN_VALUE;// to handle negative numbers.

        for(int i=0;i<size;i++) {
            if (num[i] > max) {
                secondMax = max;
                max = num[i];
            } else if (num[i] > secondMax && num[i] != max) {
                secondMax = num[i];
            }
        }

            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("No second largest number found (all elements are same).");
            } else {
                System.out.println("The second largest number is: " + secondMax);
            }

            sc.close();

        }

        }





