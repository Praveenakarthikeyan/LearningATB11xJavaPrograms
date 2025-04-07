package dayWise_Tasks;

public class Lab20_SingleInheritance {
    public static void main(String[] args) {
        honda h1 = new honda();
        h1.Quality();
        h1.Performance();
    }

}

 class bike{
     int speed;
     int mileage;

     void Performance(){
         System.out.println("providing good mileage!");
     }

}
 class honda extends bike{

    int enginePower;
    double torque;

    void Quality(){
        System.out.println("good quality product");
    }
 }
