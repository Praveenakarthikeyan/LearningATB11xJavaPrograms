package ex_23_Exceptions;

import java.util.Scanner;

public class Lab107_Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        try{
            a = n/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("Executed always");
        }
    }
}
