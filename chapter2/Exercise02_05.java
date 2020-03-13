import java.util.*;
public class Exercise02_05 {
  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double rate = input.nextDouble();

    double gratuity = subtotal * rate / 100;
    double total = subtotal + gratuity;

    System.out.println("The gratuity is " + gratuity + " and total is " + total);
  }
}
