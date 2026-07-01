package Level_1;
import java.util.*;
public class problem13_reverse2digit {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	int a = sc.nextInt();
	int b = a / 10;//tens
	int c = a % 10;//ones
	int result = c * 10+ b;
	System.out.print(result);
}
}
