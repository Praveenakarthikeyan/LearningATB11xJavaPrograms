package ex_23_Exceptions;

public class Lab105_Handle_Exceptions {
    public static void main(String[] args) {
        int a=0;
        try{
            a=100/0;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (Exception e) {
            System.out.println("Normal Exception");
        }
        System.out.println(a);

    }
}
