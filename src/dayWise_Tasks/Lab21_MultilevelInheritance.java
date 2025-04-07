package dayWise_Tasks;

public class Lab21_MultilevelInheritance {
    public static void main(String[] args) {
        HomeLoan hl = new HomeLoan(12, 100000, 2); // Provide constructor arguments
        hl.calculateSI();
        hl.calculateEMI();
        hl.calculateInterestRate();
    }
}

class Loans{

    int interest;
    int rate;
    int principal;
    int time;

    Loans(int rate,int principal,int time){
        this.rate=rate;
        this.principal=principal;
        this.time=time;
    }

    void calculateSI(){
        interest = (rate * principal * time) / 100;
        System.out.println("interest to be paid:" + interest);
    }
}

class PersonalLoan extends Loans{

    PersonalLoan(int rate, int principal, int time) {
        super(rate, principal, time);
    }
    void calculateEMI(){
        double EMI = (principal + interest) / (time * 12); // Simple EMI calculation
        System.out.println("EMI: " + EMI);
    }
}
class HomeLoan extends PersonalLoan{

    HomeLoan(int rate, int principal, int time) {
        super(rate, principal, time);
    }



    void calculateInterestRate(){
        System.out.println("Interest rate is " + rate + "%");
    }
}
