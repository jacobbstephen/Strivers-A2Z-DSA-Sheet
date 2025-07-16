// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 0;
        for(int i = 0; i < n; i++){
            // stars
            for(int j = 0; j < n - i; j++) System.out.print("*");
            // space
            for(int j = 0; j < spaces; j++) System.out.print(" ");
            // stars
            for(int j = 0; j < n - i; j++) System.out.print("*");
            System.out.println();
            spaces += 2;
        }
        spaces -= 2;
        for(int i = 0; i < n; i++){
            // stars
            for(int j = 0; j <= i; j++)System.out.print("*");
            // space
            for(int j = spaces; j > 0; j--) System.out.print(" ");
            // stars
            for(int j = 0; j <= i; j++)System.out.print("*");
            System.out.println();
            spaces -= 2;
        }
    }
}
