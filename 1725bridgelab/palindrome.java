package bridgelab;
import java.util.*;

public class palindrome {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num;
        int r = 0;

        while (num != 0) {
            int d= num % 10;
            r = r * 10 + d;
            num /= 10;
        }

        if (n == r) {
            System.out.print(n + " it is a palindrome.");
        } else {
            System.out.print(n + " it is not a palindrome.");
        }
    }
}

    

