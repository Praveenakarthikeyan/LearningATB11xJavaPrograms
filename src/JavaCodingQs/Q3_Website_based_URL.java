package JavaCodingQs;

import java.util.Scanner;

public class Q3_Website_based_URL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        String url= sc.next();

        if(url.contains(".com")){
            System.out.println("The website " + url + " is a commercial website");
        } else if (url.contains(".org")) {
            System.out.println("The website " + url + " is a Non profit organisation website");
        } else if (url.contains(".edu")) {
            System.out.println("The website " + url + " is a educational institution");
        } else if (url.contains(".gov")) {
            System.out.println(" the website " + url + " is a government website");
        } else if (url.contains(".net")) {
            System.out.println("The website" + url + " is a network related website");
        } else if (url.contains(".info")) {
            System.out.println("The website" + url + " is a information website");
        }else
            System.out.println("The website is a other type of website");
        sc.close();
    }
}
