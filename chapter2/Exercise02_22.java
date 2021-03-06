import java.util.Scanner;

public class Exercise02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount , for example 1156: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        int numOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of ");
        System.out.println("      " + numOfOneDollars + " dollars");
        System.out.println("      " + numOfQuarters + " quarters");
        System.out.println("      " + numOfDimes + " dimes");
        System.out.println("      " + numOfNickels + " nickels");
        System.out.println("      " + numOfPennies + " pennies");
    }
}
