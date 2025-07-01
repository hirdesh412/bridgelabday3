package bridgelab;

public class printpattren  {
     public static void main(String[] args) {
        //pyramid
        int r = 5;

        for (int i = 1; i <= r; i++) {
        
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
