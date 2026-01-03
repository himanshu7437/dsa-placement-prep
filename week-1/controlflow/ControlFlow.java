package controlflow;

/*
 * =========================================================
 *                 JAVA CONTROL FLOW
 * =========================================================
 *
 * Control Flow decides:
 * 1️⃣ Which code will execute
 * 2️⃣ When it will execute
 * 3️⃣ How many times it will execute
 *
 * Control Flow mainly uses:
 * ✔ Relational Operators (>, <, ==, etc.)
 * ✔ Logical Operators (&&, ||, !)
 * ✔ Arithmetic Operators (+, -, *, /, %, ++, --)
 *
 * Categories of Control Flow:
 * 1️⃣ Decision Making (if, if-else, switch)
 * 2️⃣ Looping (for, while, do-while)
 * 3️⃣ Jump Statements (break, continue, return)
 */

public class ControlFlow {

    public static void main(String[] args) {

        /*
         * =================================================
         * 1️⃣ DECISION MAKING STATEMENTS
         * =================================================
         */

        int marks = 72;

        // IF STATEMENT
        // Executes only when condition is true
        if (marks >= 40) {
            System.out.println("Pass");
        }

        // IF - ELSE STATEMENT
        // One block always executes
        if (marks >= 90) {
            System.out.println("Grade A");
        } else {
            System.out.println("Grade not A");
        }

        // ELSE - IF LADDER
        // Multiple conditions checked one by one
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        /*
         * =================================================
         * SWITCH STATEMENT
         * =================================================
         * Used when checking ONE variable
         * against FIXED values
         */

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        /*
         * =================================================
         * 2️⃣ LOOPING STATEMENTS
         * =================================================
         */

        // FOR LOOP
        // Used when number of iterations is known
        System.out.println("\nFor Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }

        // WHILE LOOP
        // Condition checked BEFORE loop body
        System.out.println("\nWhile Loop Example:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++; // arithmetic operator controls loop
        }

        // DO - WHILE LOOP
        // Executes AT LEAST once
        System.out.println("\nDo-While Loop Example:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        /*
         * =================================================
         * 3️⃣ JUMP STATEMENTS
         * =================================================
         */

        // BREAK
        // Stops loop completely
        System.out.println("\nBreak Example:");
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }

        // CONTINUE
        // Skips current iteration
        System.out.println("\nContinue Example:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.println(k);
        }

        // RETURN
        // Ends method execution
        System.out.println("\nReturn Example:");
        displayMessage();

        /*
         * =================================================
         * IMPORTANT NOTES:
         *
         * ✔ Conditions use relational & logical operators
         * ✔ Loops heavily use arithmetic operators (++ / --)
         * ✔ % operator is used for even/odd logic
         * ✔ break, continue change flow instantly
         *
         * =================================================
         */

        System.out.println("\n--- END OF CONTROL FLOW ---");
    }

    // Method for return example
    static void displayMessage() {
        System.out.println("Method executed, returning now");
        return;
    }
}
