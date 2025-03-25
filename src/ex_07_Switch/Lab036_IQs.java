package ex_07_Switch;

public class Lab036_IQs {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
