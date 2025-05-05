package ex_25_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab119_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y"; // Control variable for input loop

        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = scanner.nextInt();
            ages.add(age);


            scanner.nextLine();
            System.out.print("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();
        }
    }
}
