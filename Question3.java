import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // instance of Scanner
        Scanner scanner = new Scanner(System.in);

        // asks for the value of a
        System.out.print("Enter the value of a : ");
        String a = scanner.nextLine();
        System.out.print("Enter the value of b : ");
        String b = scanner.nextLine();
        System.out.print("Enter the value of c : ");
        String c = scanner.nextLine(); 

        // closing the scanner 
        scanner.close(); 

        // Converting the  string inputs into integer

        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c); 

        /// Breakdown of the root equation 
        int bSquare   = (int) Math.pow(B, 2) ;  
        int fourAC = 4 *A*C ; 
        int twoA = 2*A ;  

    }
}
