package dayWise_Tasks;

public class Lab5_CLIOption1 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int result=(n1>n2) ? n1 : n2;
        System.out.println("The maximum number is:" +result);
    }
}
