public class Problems {

    public static void main(String[] args) {
        
        // ques 1) count digits
        // ques 2) reverse Integer
        // ques 3) is palindrome?
        // ques 4) gcd/hcf
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


    // soln3

    public boolean isPalindrome(int x) {
        // Time Complexity: O(d / 2) ≈ O(d)
        // Space Complexity: O(1)

        // negative numbers and numbers ending with 0 (except 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        // for even digits: x == reversedHalf
        // for odd digits: x == reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }

    
    // soln4

    // Time Complexity: O(log(min(a, b)))
    // Each step reduces the problem size significantly

    // Space Complexity:
    // Iterative: O(1)
    // Recursive: O(log(min(a, b))) due to recursion stack

    // --- approach 1 (recursive) ------
    public static int gcd1(int a, int b) {
        if (b == 0) return a;
        return gcd1(b, a%b);
    }

    // --- approach 2 (iterative) -----
    public int gcd2(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    
}