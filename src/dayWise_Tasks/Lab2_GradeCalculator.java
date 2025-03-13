package dayWise_Tasks;

import java.util.Scanner;

public class Lab2_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int grade1=sc.nextInt();
        String result = (grade1<59)?"F" :(grade1>=60 && grade1<70)?"D":(grade1>=70 && grade1<80)?"C"
                :(grade1<90)?"B" :"A";
        System.out.println(result);
    }
}
