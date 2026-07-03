package Level_1;
import java.util.*;

public class problem18_2digits_tensdigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");

		int num = sc.nextInt();
		int ones = num % 10;
		int result = 10 + ones;
		
		System.out.println(result);
	}

}
