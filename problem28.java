package Level_1;
import java.util.*;
public class problem28 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number: ");
	        int num = sc.nextInt();

	        int hundreds = num / 100;
	        int ones = num % 10;

	        int sum = hundreds + ones;

	        System.out.println((sum < 10) ? "Success" : "Failure");
}
}