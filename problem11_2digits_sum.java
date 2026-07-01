package Level_1;
import java.util.*;
public class problem11_2digits_sum {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	
	int num = sc.nextInt();
	int a = num % 10;// ones
	int b = num / 10;// tens
	int result = a+b;
	
	System.out.print(result);
}
}
