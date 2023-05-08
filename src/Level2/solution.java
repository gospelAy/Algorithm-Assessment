package Level2;

public class solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(234379));
    }
    public static boolean isPalindrome(int x) {
        int reverse = x;
        reverse = Integer.parseInt(String.valueOf(reverse));
        int count = 0;
        for (int i = reverse -1 ; i >= 0; i--) {
            if (x == reverse)
                return true;
        }
        return false;
    }
}
