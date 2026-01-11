public class Problems {
    
    public static void main(String[] args) {
        
        // ques - 1) print name N times
        // ques - 2) print 1 to N
        // ques - 3) print N to 1
        // ques - 4) sum of first N
        // ques - 5) factorial of N
        // ques - 6) reverse an array
        // ques - 7) check if a string is palindrome or not
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


}
