import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly saving amount: ");
        double num = input.nextDouble();
        double n_total = num;

        n_total = n_total * (1 + 0.00417);
        System.out.println("After the first month, the account value is " + n_total);

        n_total = (n_total + num) * (1 + 0.05 / 12);
        System.out.println("After the second month, the account value is " + n_total);

        n_total = (n_total + num) * (1 + 0.05 / 12);
        System.out.println("After the third month, the account value is " + n_total);

        n_total = (n_total + num) * (1 + 0.05 / 12);
        System.out.println("After the fourth month, the account value is " + n_total);

        n_total = (n_total + num) * (1 + 0.05 / 12);
        System.out.println("After the fifth month, the account value is " + n_total);

        n_total = (n_total + num) * (1 + 0.05 / 12);
        System.out.println("After the sixth month, the account value is " + n_total);
    }
}
