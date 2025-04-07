package dayWise_Tasks;

import java.util.Scanner;

public class Lab18_ATMWithdrawCalc {
    public static void main(String[] args) {
        /*Initialize the account balance with a fixed amount (e.g., ₹10,000).
        2️⃣ Take user input for the amount they want to withdraw.
        3️⃣ Check withdrawal conditions:

        The amount should be greater than zero.

                The amount should be a multiple of 100 (common ATM rule).

        The amount should not exceed the account balance.
        4️⃣ Deduct the amount from the balance if conditions are met.
        5️⃣ Display the updated balance or an error message if the withdrawal fails.
         */

        double acctBalance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:");
        double amount = sc.nextDouble();
        if(amount>0 && (amount % 100==0) && (amount<=acctBalance)){
            acctBalance=acctBalance-amount;
            System.out.println("Withdrawal successful");
            System.out.println("The balance amount :" +acctBalance);
        }else
            System.out.println("withdrawal fails! check the amount you entered");
        sc.close();
    }

}
