import java.util.Scanner;
public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int unit =0;
        while(number < 0 || number >1000){
            number = input.nextInt();
        }
        while(number>0) {
            unit += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits is " + unit);

    }

}
/*  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();

    int last = number % 10;
    int updateNumber = number / 10;
    int second = updateNumber % 10;
    updateNumber = updateNumber / 10;
    int third = updateNumber % 10 + updateNumber / 10;
    int sum = last + second + third;

    System.out.println("The sum of the digits is " + sum);
  }
 */
