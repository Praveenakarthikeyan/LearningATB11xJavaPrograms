package ex_11_Functions;

public class Lab062_SimpleMethod {
    public static void main(String[] args) {
        int result = return_int();
        System.out.println(result);

        boolean r = return_boolean();
        System.out.println(r);
    }
    static int return_int(){
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }
}
