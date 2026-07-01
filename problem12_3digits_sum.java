package Level_1;

import java.util.*;

public class problem12_3digits_sum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = sc.nextInt();

        int a = num / 100;        // hundreds
        int b = (num / 10) % 10; // tens
        int c = num % 10;        // ones

        int result = a + b + c;

        System.out.println(result);

        sc.close();
    }
}