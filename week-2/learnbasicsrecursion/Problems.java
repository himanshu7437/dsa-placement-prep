public class Problems {
    
    public static void main(String[] args) {
        
        // ques - 1) print name N times
        // ques - 2) print 1 to N
        // ques - 3) print N to 1
        // ques - 4) sum of first N
        // ques - 5) factorial of N
        // ques - 6) reverse an array - reverseHelper(arr, 0, arr.length - 1);
        // ques - 7) check if a string is palindrome or not - helper(s, 0, s.length() - 1);
        // ques - 8) fibonacci number
    }

    // soln1

    public static void printGfg(int N) {

        /*
         Time Complexity: O(N)
         Explanation:
         - Function is called N times
         - Each call prints once

         Space Complexity: O(N)
         Explanation:
         - Recursive call stack holds N calls
         */

        if (N == 0) return;

        System.out.print("GFG ");
        printGfg(N - 1);
    }

    // soln2

    public static void printTillN(int N) {

        /*
         Time Complexity: O(N)
         Explanation:
         - Function is called N times
         - One print operation per call

         Space Complexity: O(N)
         Explanation:
         - Recursive call stack stores N function calls
         */

        if (N == 0) return;

        printTillN(N - 1);
        System.out.print(N + " ");
    }

    // soln3

    public static void printNos(int N) {

        /*
         Time Complexity: O(N)
         Explanation:
         - Function is called N times
         - One print operation per call

         Space Complexity: O(N)
         Explanation:
         - Recursive call stack stores N function calls
         */

        if (N == 0) return;

        System.out.print(N + " ");
        printNos(N - 1);
    }

    // soln4 

    public static int findSum(int n) {

        /*
         Time Complexity: O(N)
         Explanation:
         - Function is called once for each value from n to 0

         Space Complexity: O(N)
         Explanation:
         - Recursive call stack stores N function calls
         */

        if (n == 0) return 0;
        return n + findSum(n - 1);
    }

    // soln5 

    public static int factorial(int n) {

        /*
         Time Complexity: O(N)
         Explanation:
         - Function is called once for each value from n to 1

         Space Complexity: O(N)
         Explanation:
         - Recursive call stack stores N function calls
         */

        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    
    // soln6

    public static void reverseHelper(int arr[], int left, int right) {
        /*
        Time Complexity: O(N)
        - Each element is visited once to swap.
        - Total N/2 swaps → O(N)

        Space Complexity: O(N)
        - Recursive call stack stores N/2 calls (O(N) in worst case)
        */

        /*
         Base Case:
         If left >= right, all elements are swapped, stop recursion
        */
        if (left >= right) return;

        // Swap elements at left and right
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recurse for the next pair
        reverseHelper(arr, left + 1, right - 1);
    }

    // soln7

     public static boolean helper(String s, int left, int right) {
        /*
        Time Complexity: O(N)
        - Each character is visited at most once
        - Skipping non-alphanumeric is O(1) per character

        Space Complexity: O(N)
        - Recursive call stack depth can go up to N in worst case
        */

        // Base case: pointers crossed
        if (left >= right) return true;

        // Skip non-alphanumeric on left
        if (!Character.isLetterOrDigit(s.charAt(left))) {
            return helper(s, left + 1, right);
        }

        // Skip non-alphanumeric on right
        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return helper(s, left, right - 1);
        }

        // Compare lowercase
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        // Recurse on inner substring
        return helper(s, left + 1, right - 1);
    }

    // soln8

    public static  int fib(int n) {
        /*
        Time Complexity: O(2^N)
        - Each call spawns 2 more calls (except base cases)
        - Exponentially grows with N

        Space Complexity: O(N)
        - Recursion stack depth = N
        */

        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

}
