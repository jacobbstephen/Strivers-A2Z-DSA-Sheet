// A
// BB
// CCC
// DDDD
// EEEEE
public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 0; i < n; i++){
            ch = (char) ('A' + i);
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
