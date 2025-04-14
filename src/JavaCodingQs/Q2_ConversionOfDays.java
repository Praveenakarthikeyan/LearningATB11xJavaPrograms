package JavaCodingQs;

import java.util.Scanner;

public class Q2_ConversionOfDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the days:");
        int totalDays = sc.nextInt();

        int years=totalDays/365;
        int remainingDays=totalDays%365;
        int months=totalDays/30;
        int days=totalDays%30;
        System.out.println(years + " years, " + months + " months, and " + days + " days.");

sc.close();

    }
}
