import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise02_20 {
  public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and annual interest rate: ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);
        DecimalFormat df5 = new DecimalFormat("#.00000");

        System.out.println("The interest is " + df5.format(interest));

  }
}
