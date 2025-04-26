package dayWise_Tasks;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        boolean found = false;

        System.out.print("Element " + searchElement + " found at index/indices: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        } else {
            System.out.println(); // for newline
        }

        scanner.close();
    }
}
