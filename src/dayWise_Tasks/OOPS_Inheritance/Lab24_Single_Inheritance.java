package dayWise_Tasks.OOPS_Inheritance;

public class Lab24_Single_Inheritance {
    public static void main(String[] args) {
        Son sp = new Son();
        // Set values
        sp.height = 175;
        sp.bloodGroup = "O+";
        sp.houseProperty = "2BHK Villa";

        // Display values
        sp.displayHeight(); // Inherited from Father

        System.out.println("Blood Group is: " + sp.displayBloodGroup());
        System.out.println("House Property: " + sp.displayHouseProperty());

    }
}

class Father{

    String bloodGroup;
    int height;

    void displayHeight(){
        System.out.println("Height is: " + height + " cm");
    }

    String displayBloodGroup(){
        return bloodGroup;
    }
}

class Son extends Father{
    String houseProperty;

    String displayHouseProperty(){
        return houseProperty;
    }
}
