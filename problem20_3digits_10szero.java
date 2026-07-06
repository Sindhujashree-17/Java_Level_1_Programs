package Level_1;
import java.util.*;
public class problem20_3digits_10szero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int result = (num / 100) * 100 + (num % 10);

        System.out.println("Number after making ten's digit 0: " + result);
    }
}
