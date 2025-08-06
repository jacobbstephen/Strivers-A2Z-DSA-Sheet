

public class ReverseNumber {
    static int reverse(int x) {
        int rev = 0;
        boolean flag = x < 0;
        x = x < 0 ? x * -1:x;
        while(x > 0){
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return flag == false? rev: rev * - 1;
    }
    public static void main(String[] args) {
        int num = 125;
        System.out.println("Result: " + reverse(num));
    }
}
