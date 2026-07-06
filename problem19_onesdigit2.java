package Level_1;
import java.util.*;
public class problem19_onesdigit2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter");
		 
		int num = sc.nextInt();
		int result = (num / 10 ) * 10 +2;
		System.out.println(result);
		}
}
