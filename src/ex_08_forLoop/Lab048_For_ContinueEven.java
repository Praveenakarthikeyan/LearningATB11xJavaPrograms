package ex_08_forLoop;

public class Lab048_For_ContinueEven {
    public static void main(String[] args) {
        for (int i = 1; i <= 50 ; i++) { // 0 to 50, 51 Times
            if(i%2 ==0){
                System.out.println("Even -> "+i);
                continue;
            }
            System.out.println("Odd -> "+i);
        }
    }
}
