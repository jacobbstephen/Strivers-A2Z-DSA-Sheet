// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int space = 2 * (n - 1);
        for(int i = 0; i < n; i++){
            int num = 1;
            // number
            for(int j = 0; j <= i; j++){
                System.out.print(num++);
            }
            num--;
            // space
            for(int j =0; j < space; j++){
                System.out.print(" ");
            }
            
            // number
            for(int j = 0; j <= i; j++){
                System.out.print(num--);
            }
            System.out.println();
            space -= 2;
        }
    }
}
