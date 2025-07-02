package twojuly;
import java.util.Scanner;

public class zerotoend {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int index = 0; 


        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }


        while (index < n) {
            arr[index++] = 0;
        }


        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


