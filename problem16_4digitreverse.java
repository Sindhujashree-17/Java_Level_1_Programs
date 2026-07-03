package Level_1;
import java.util.*;

public class problem16_4digitreverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int first = num / 1000;
        int second = (num / 100) % 10;
        int lastTwo = num % 100;

        int result = second * 1000 + first * 100 + lastTwo;

        System.out.println(result);

        sc.close();
    }
}