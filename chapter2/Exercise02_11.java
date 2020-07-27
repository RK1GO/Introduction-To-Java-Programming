import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int number = input.nextInt();
        double population = 312032486 + number * 365 * 24 * 60 * 60 / 7.0 - number * 365 * 24 * 60 * 60 / 13.0 + number * 365 * 24 * 60 * 60 / 45.0;
        System.out.println("The population in " + number + " years is " + (int)population);
    }
}
