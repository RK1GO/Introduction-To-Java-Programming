import java.util.*;
public class Exercise02_07 {
    public static void main(String[] args) {
        long year= 0, day= 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long min = input.nextLong();
        day =  ((min/60)/24)%365;
        year= min/60/24/365;
        System.out.println(min + " minutes is approximately " + year +" years and " + day + " days ");

    }
}
