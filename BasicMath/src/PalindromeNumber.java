public class PalindromeNumber {
    static int reverse(int N){
        int reverse_num = 0;

        while(N != 0){
            int digit = N % 10;
            reverse_num = reverse_num * 10 + digit;
            N = N/10;
        }
        return reverse_num;
    }
    public static void main(String[] args) {

        int N = 121;
        int dummy = N;
        int Y = reverse(N);
        if (dummy == Y) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }

    }
}
