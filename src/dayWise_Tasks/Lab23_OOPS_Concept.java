package dayWise_Tasks;

public class Lab23_OOPS_Concept {
    public static void main(String[] args) {
        // Create an array of ATB students
        ATB1[] students = new ATB1[3];

        // Add student objects to the array
        students[0] = new ATB1("Arun", 25, "QA Engineer");
        students[1] = new ATB1("Priya", 23, "Web Developer");
        students[2] = new ATB1("Vikram", 26, "Senior QA");

        // Print all student details
        for (ATB1 student : students) {
            System.out.println(student);
        }
    }

    }

class ATB1{
    private String name;
    private int age;
    private String role;

  ATB1(String name,int age, String role){
      this.name = name;
      this.age = age;
      this.role = role;
  }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // toString method to print object details
    @Override
    public String toString() {
        return "ATB Student [Name=" + name + ", Age=" + age + ", Role=" + role + "]";
    }
}
