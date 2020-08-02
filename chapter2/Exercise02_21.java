import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount : ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years:");
        int numOfYears = input.nextInt();

        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numOfYears * 12);
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.print("Future value is " + df2.format(futureValue));
    }
}
