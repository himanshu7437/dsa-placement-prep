package operators;

/*
 * =========================================================
 *        JAVA OPERATORS – ARITHMETIC, BITWISE,
 *        RELATIONAL & LOGICAL
 * =========================================================
 *
 * This file explains:
 * 1️⃣ Arithmetic Operators
 * 2️⃣ Bitwise Operators
 * 3️⃣ Relational Operators
 * 4️⃣ Logical Operators
 *
 * After this topic, you can confidently move to:
 * 👉 If–Else
 * 👉 Control Flow
 * 👉 Loops
 */

public class Operators {

    public static void main(String[] args) {

        /*
         * =================================================
         * 1️⃣ ARITHMETIC OPERATORS
         * =================================================
         */

        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators:");

        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b)); // 1

        double x = 10;
        double y = 3;

        System.out.println("\nDecimal Division:");
        System.out.println("x / y = " + (x / y)); // 3.333...

        /*
         * =================================================
         * INCREMENT & DECREMENT
         * =================================================
         */

        int num = 5;

        System.out.println("\nIncrement & Decrement:");

        System.out.println("num++ = " + num++); // 5
        System.out.println("After num++: " + num); // 6
        System.out.println("++num = " + ++num); // 7
        System.out.println("num-- = " + num--); // 7
        System.out.println("--num = " + --num); // 5

        /*
         * =================================================
         * 2️⃣ BITWISE OPERATORS
         * =================================================
         */

        int p = 5;  // 0101
        int q = 3;  // 0011

        System.out.println("\nBitwise Operators:");

        System.out.println("p & q = " + (p & q)); // 1
        System.out.println("p | q = " + (p | q)); // 7
        System.out.println("p ^ q = " + (p ^ q)); // 6
        System.out.println("~p = " + (~p));

        /*
         * =================================================
         * SHIFT OPERATORS
         * =================================================
         */

        int n = 8; // 1000

        System.out.println("\nShift Operators:");
        System.out.println("n << 1 = " + (n << 1)); // 16
        System.out.println("n << 2 = " + (n << 2)); // 32
        System.out.println("n >> 1 = " + (n >> 1)); // 4
        System.out.println("n >> 2 = " + (n >> 2)); // 2

        /*
         * =================================================
         * 3️⃣ RELATIONAL OPERATORS
         * =================================================
         *
         * Used to compare two values.
         * Result is ALWAYS boolean (true / false)
         */

        int r1 = 10;
        int r2 = 5;

        System.out.println("\nRelational Operators:");

        System.out.println("r1 > r2  = " + (r1 > r2));   // true
        System.out.println("r1 < r2  = " + (r1 < r2));   // false
        System.out.println("r1 >= r2 = " + (r1 >= r2));  // true
        System.out.println("r1 <= r2 = " + (r1 <= r2));  // false
        System.out.println("r1 == r2 = " + (r1 == r2));  // false
        System.out.println("r1 != r2 = " + (r1 != r2));  // true

        /*
         * NOTE:
         * =  -> assignment
         * == -> comparison
         */

        /*
         * =================================================
         * 4️⃣ LOGICAL OPERATORS
         * =================================================
         *
         * Used to combine multiple conditions
         */

        System.out.println("\nLogical Operators:");

        int age = 20;
        boolean hasID = true;

        // Logical AND (&&)
        if (age >= 18 && hasID) {
            System.out.println("Allowed entry (AND)");
        }

        int marks = 35;

        // Logical OR (||)
        if (marks >= 40 || marks >= 90) {
            System.out.println("Condition passed (OR)");
        }

        boolean isRaining = false;

        // Logical NOT (!)
        if (!isRaining) {
            System.out.println("You can go outside (NOT)");
        }

        /*
         * =================================================
         * 📌 FINAL SUMMARY
         * =================================================
         *
         * ARITHMETIC:
         * +  -  *  /  %
         *
         * BITWISE:
         * &  |  ^  ~  <<  >>
         *
         * RELATIONAL:
         * >  <  >=  <=  ==  !=
         *
         * LOGICAL:
         * &&  ||  !
         *
         * =================================================
         * NEXT TOPIC:
         * 👉 Control Flow (if-else, loops)
         * =================================================
         */

        System.out.println("\n--- END OF OPERATORS ---");
    }
}
