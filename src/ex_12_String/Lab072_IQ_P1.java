package ex_12_String;

public class Lab072_IQ_P1 {
    public static void main(String[] args) {
        // == -> Comparsion -> String -> this check the locations ref.
        // equals ( content) -> value

        String s1="hello";//scp(String constant pool)
        String s2="hello";

        String s3= new String("hello");
        String s4= new String("hello");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
