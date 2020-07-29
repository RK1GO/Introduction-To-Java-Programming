import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = v * v / (2 * a);
        System.out.println("The minimum runway length for this airplane is " + length);
        /*System.out.println("Enter speed and acceleration: ");
        String aa = input.nextLine();
        String[] ss = aa.split(" ");
        double num1 = Double.parseDouble(ss[0]);
        double num2 = Double.parseDouble(ss[1]);
        double len = num1 * num1 / (2 * num2);
        DecimalFormat df3= new DecimalFormat("#.000");
        String leng = df3.format(len);
        System.out.println("The minimum runway length for this airplane is " + leng);*/

    }
}
