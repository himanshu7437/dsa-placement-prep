public class Problems {

    public static void main(String[] args) {
        
        // ques 1) count digits
        // ques 2) reverse Integer
    }

    // soln1

    public int countDigits(int n) {
    // Time Complexity:
    // O(d), where d is the number of digits in n.
    // In each iteration, n is divided by 10, so the loop runs once per digit.
    // Given the constraint n ≤ 10^5, d ≤ 6.

    // Space Complexity:
    // O(1), because only a constant amount of extra space is used
    // (the variable 'count'), regardless of the size of n.

    if (n == 0) return 1;

    int count = 0;

    while (n != 0) {
        n /= 10;
        count++;
    }
    
    return count;
}


    // soln2

    public int reverse(int x) {
        // Time Complexity:
        // O(d), where d is the number of digits in x (max 10 for 32-bit int)

        // Space Complexity:
        // O(1), constant extra space

        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Overflow check (positive)
            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Overflow check (negative)
            if (result < Integer.MIN_VALUE / 10 ||
               (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
        }

        return result;
    }


}