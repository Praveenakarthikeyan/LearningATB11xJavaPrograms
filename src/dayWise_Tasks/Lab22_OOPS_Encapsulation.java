package dayWise_Tasks;

public class Lab22_OOPS_Encapsulation {
    public static void main(String[] args) {

        ATB a = new ATB();
        a.setCourseDuration("3 months");
        a.setCourseFees(12000);
        System.out.println("course duration is:" +a.getCourseDuration());
        System.out.println("course fees is:" +a.getCourseFees());


    }
}

class ATB{


    private String courseDuration;
    private int courseFees;

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }



    public int getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(int courseFees) {
        this.courseFees = courseFees;
    }


    }


