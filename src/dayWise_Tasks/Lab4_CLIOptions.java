package dayWise_Tasks;

public class Lab4_CLIOptions {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println("name is " +name +"," + "age is " +age +"," +"salary: " +salary);

    }
}
