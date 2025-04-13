package dayWise_Tasks.JavaCoding;

import java.util.Scanner;

public class Q1_Check_PositiveOrNegative {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.checkPositiveOrNegative();
    }
}
class Calculate{

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    void checkPositiveOrNegative(){
        if(n>0){
            System.out.println(n + " is a positive number");
        }
        else
            System.out.println(n + " is a negative number");
    }

}
