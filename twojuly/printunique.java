package bridgelab.twojuly;
import java.util.Scanner;
public class printunique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter no.: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        System.out.println("elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Unique:");
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


