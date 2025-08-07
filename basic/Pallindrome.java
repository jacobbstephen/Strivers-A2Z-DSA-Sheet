public class Pallindrome {
    static int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
    static boolean isPalindrome(int x) {
        boolean isNegative = x < 0;
        if(isNegative) return false;
        return x == reverse(x) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
