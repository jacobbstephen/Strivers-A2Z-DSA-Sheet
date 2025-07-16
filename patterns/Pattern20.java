// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
public class Pattern20 {
   public static void main(String[] args) {
        int n = 5;
        int stars = 0;
        int spaces = 2 * n - 2;
        for(int i = 1; i <= 2 * n - 1; i++){
            // stars
            stars = i > n ? 2 * n - i : i;
            for(int j =1; j <= stars; j++) System.out.print("*");

            // spaces
            for(int j = 1; j <= spaces; j++ ) System.out.print(" ");

            // stars
            for(int j =1; j <= stars; j++) System.out.print("*");
            System.out.println();
            if(i < n) spaces -= 2;
            else spaces += 2;
        }
   } 
}
