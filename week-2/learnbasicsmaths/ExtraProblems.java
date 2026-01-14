
public class ExtraProblems {
    
    public static void main(String[] args) {
        
        // ques - 1) divide two Integers
        // ques - 2) power of two
        // ques - 3) power of three
        // ques - 4) power of four
        // ques - 5) add digits

    }

    // soln1

    public static int divide(int dividend, int divisor) {
        /*
        Time Complexity:
        O(log(dividend))
        - Each iteration doubles the divisor (bit shifting)
        - Very fast compared to repeated subtraction

        Space Complexity:
        O(1)
        - Only constant extra variables used
        */

        // 🔴 Overflow case:
        // Integer.MIN_VALUE = -2^31
        // Dividing it by -1 gives 2^31, which is out of int range
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // 🔹 Step 1: Determine sign of the result
        // XOR → true if signs are different → result is negative
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // 🔹 Step 2: Convert both numbers to positive long
        // long is used to safely handle Integer.MIN_VALUE
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int quotient = 0;

        // 🔹 Step 3: Subtract divisor in large chunks using bit shifting
        while (a >= b) {

            long temp = b;      // current multiplied divisor
            int multiple = 1;   // how many times divisor is used

            // Keep doubling temp until it exceeds a
            while (a >= (temp << 1)) {
                temp <<= 1;         // temp = temp * 2
                multiple <<= 1;    // multiple = multiple * 2
            }

            // Subtract the largest possible chunk
            a -= temp;

            // Add how many times we subtracted
            quotient += multiple;
        }

        // 🔹 Step 4: Apply sign
        return negative ? -quotient : quotient;
    }

    // soln2

    public static boolean isPowerOfTwo(int n) {
        // Time Complexity: O(1)
        // Space Complexity: O(1)

        return n > 0 && (n & (n-1)) == 0;
    }

    // soln3

    public static boolean isPowerOfThree(int n) {
        /*
        Time Complexity:
        O(log₃ n)
        - n is divided by 3 in each iteration

        Space Complexity:
        O(1)
        - No extra space used
        */

        // Negative numbers and 0 cannot be powers of 3
        if (n <= 0) return false;

        // Keep dividing by 3 while possible
        while (n % 3 == 0) {
            n /= 3;
        }

        // If reduced to 1, it's a power of 3
        return n == 1;
    }

    // soln4

    public boolean isPowerOfFour(int n) {
        /*
        Time Complexity:
        O(log₃ n)
        - n is divided by 3 in each iteration

        Space Complexity:
        O(1)
        - No extra space used
        */

        // Negative numbers and 0 cannot be powers of 4
        if (n <= 0) return false;

        // Keep dividing by 4 while possible
        while (n % 4 == 0) {
            n /= 4;
        }

        // If reduced to 1, it's a power of 4
        return n == 1;
    }

    // soln5

    // --- approach - 1(using loop) ----

    public int addDigits1(int num) {
        /*
         * Time Complexity:
         * - Each digit-sum operation takes O(d), where d = number of digits
         * - The process repeats until the number becomes a single digit
         * - Overall Time Complexity: O(d)
         *
         * Space Complexity:
         * - O(1), because only a few integer variables are used
         */

        // Keep reducing the number until it becomes a single digit
        while (num >= 10) {

            int digitSum = 0;

            // Extract digits and compute their sum
            while (num != 0) {
                int digit = num % 10;   // get last digit
                digitSum += digit;      // add digit to sum
                num /= 10;              // remove last digit
            }

            // Update num with the sum of digits
            num = digitSum;
        }

        // Return the single-digit result
        return num;
    }

    // --- approach 2(without loop) ---

    public int addDigits2(int num) {
        /*
         * Time Complexity:
         * - O(1) → constant time
         *   No loops or recursion used
         *
         * Space Complexity:
         * - O(1) → constant space
         *   Only a few integer variables are used
         */

        // Edge case: if number is 0, its digital root is 0
        if (num == 0) {
            return 0;
        }

        // If number is divisible by 9, digital root is 9
        if (num % 9 == 0) {
            return 9;
        }

        // Otherwise, digital root is num % 9
        return num % 9;
    }

    
}
