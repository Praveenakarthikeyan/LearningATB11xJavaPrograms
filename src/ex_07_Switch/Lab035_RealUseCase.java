package ex_07_Switch;

import java.util.Scanner;

public class Lab035_RealUseCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
