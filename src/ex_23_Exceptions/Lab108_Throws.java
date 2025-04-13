package ex_23_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab108_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
