package ex_20_Static_Keyword;

public class Lab096_Static_IIB {
    public static void main(String[] args) {
        TestClass tc1 = new TestClass();
    }
}
class TestClass {
    static {
        System.out.println("This is Static Initialization Block");
    }

    TestClass() {
        System.out.println("This is default constructor");
    }

    {
        System.out.println("This is Instance Initialization Block");
    }
}