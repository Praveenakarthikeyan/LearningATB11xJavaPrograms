package dayWise_Tasks;

public class Lab15_OOPS_ObjectCreation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.greet();
        p1.details("Praveena",  27,"female");
        boolean married = p1.isMarried();
        System.out.println("am I married:" + married);
        String address = p1.addressDetails("54, Township");
        System.out.println("address below:" +address);

    }




}

    class Person{
        String name;
        byte age;
        long phonenoL;
        int dob;
        String address;
        String gender;
        boolean married;
        int pincode;
        float height;
        float weight;

        void greet(){
            System.out.println("welcome to learning world!");
        }

         void details(String name, int age, String gender){
            System.out.println("my name is:" +name + "\nage is:" +age +"\ngender is:"+gender);
        }

        boolean isMarried(){
            married=true;
            return married;
        }

         String addressDetails(String address){
            return address;
        }

    }

