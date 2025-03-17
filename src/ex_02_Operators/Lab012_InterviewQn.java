package ex_02_Operators;

public class Lab012_InterviewQn {
    public static void main(String[] args) {
        char a = 'A'; // ASCII -> 65
        char b = 'B'; // 66

        System.out.println(a);
        System.out.println(b);

        System.out.println(a + b);
        System.out.println('C'+'D');

        System.out.println('A' == 65);
        System.out.println('C' == 67);

        short s = 10;
        char c = 'A';//65
        System.out.println(c * s);

        int i='A';
        System.out.println(i);
        i='Z';
        System.out.println(i);

        i='a';
        System.out.println(i);
        i='z';
        System.out.println(i);
    }
}
