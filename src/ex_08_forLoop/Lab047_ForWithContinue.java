package ex_08_forLoop;

public class Lab047_ForWithContinue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==4)
                continue;
            System.out.println(i);
        }
    }
}
