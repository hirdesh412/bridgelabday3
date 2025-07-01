package bridgelab;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

    
        int d = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            d++;
        }

        
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, d);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}


