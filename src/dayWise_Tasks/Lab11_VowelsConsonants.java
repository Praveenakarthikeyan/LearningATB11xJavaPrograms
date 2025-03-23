package dayWise_Tasks;

import java.util.Scanner;

public class Lab11_VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
       int vowelCount=0, consonantCount=0;
       for( int i= 0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }else
                consonantCount++;
        }
        System.out.println(" no of vowels:" +vowelCount );
        System.out.println("no of consonants: " +consonantCount);
    }
}
