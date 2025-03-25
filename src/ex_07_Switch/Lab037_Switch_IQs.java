package ex_07_Switch;

public class Lab037_Switch_IQs {
    public static void main(String[] args) {
        int a = 11;
        switch (-1) {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
