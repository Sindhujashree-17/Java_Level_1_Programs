package Level_1;

import java.util.Scanner;

public class problem10_3digitstens {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		
		int a = sc.nextInt();
		int b = (a/10)%10;
		System.out.println(b);
	}

}
