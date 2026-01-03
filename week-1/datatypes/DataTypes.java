package datatypes;

/*
 * =========================================================
 *        JAVA DATA TYPES – COMPLETE & EASY GUIDE
 * =========================================================
 *
 * This file explains:
 * 1. Primitive Data Types
 * 2. Type Promotion
 * 3. Widening Conversion
 * 4. Narrowing Conversion
 * 5. String Data Type (VERY IMPORTANT)
 *
 * After understanding this file, you are ready to move to:
 * 👉 Operators
 * 👉 Conditions
 * 👉 Loops
 */

public class DataTypes {

    public static void main(String[] args) {

        /*
         * =================================================
         * 1️⃣ INTEGRAL DATA TYPES (Whole Numbers)
         * =================================================
         */

        byte b = 10;       // 1 byte → very small numbers
        short s = 1000;    // 2 bytes
        int i = 100000;    // 4 bytes → MOST USED
        long l = 10000000000L; // 8 bytes → very large numbers

        System.out.println("Integral Types:");
        System.out.println(b + ", " + s + ", " + i + ", " + l);

        /*
         * TYPE PROMOTION
         * Java automatically converts smaller types to bigger ones
         * during calculations.
         */

        System.out.println("\nType Promotion Example:");
        System.out.println(s + l); // short → long → result is long

        /*
         * =================================================
         * 2️⃣ DECIMAL DATA TYPES
         * =================================================
         */

        float f = 3.14f;       // 4 bytes → less precise
        double d = 3.14159265; // 8 bytes → more precise (DEFAULT)

        System.out.println("\nDecimal Types:");
        System.out.println("float  = " + f);
        System.out.println("double = " + d);

        /*
         * =================================================
         * 3️⃣ BOOLEAN DATA TYPE
         * =================================================
         */

        boolean isJavaFun = true;
        boolean isSkyGreen = false;

        System.out.println("\nBoolean Type:");
        System.out.println(isJavaFun);
        System.out.println(isSkyGreen);

        /*
         * =================================================
         * 4️⃣ CHARACTER DATA TYPE
         * =================================================
         */

        char ch = 'A';      // single character
        char symbol = '#';  // symbols allowed

        System.out.println("\nCharacter Type:");
        System.out.println(ch);
        System.out.println(symbol);

        /*
         * =================================================
         * 5️⃣ WIDENING TYPE CONVERSION (AUTOMATIC)
         * =================================================
         *
         * Smaller → Bigger
         * Safe
         * No data loss
         */

        int small = 100;
        long big = small;        // int → long
        double bigger = big;     // long → double

        System.out.println("\nWidening Conversion:");
        System.out.println(big);
        System.out.println(bigger);

        /*
         * =================================================
         * 6️⃣ NARROWING TYPE CONVERSION (EXPLICIT CASTING)
         * =================================================
         *
         * Bigger → Smaller
         * NOT automatic
         * Data loss possible
         */

        double price = 99.99;
        int roundedPrice = (int) price; // decimal part lost

        System.out.println("\nNarrowing Conversion:");
        System.out.println("Before casting: " + price);
        System.out.println("After casting : " + roundedPrice);

        /*
         * =================================================
         * 7️⃣ STRING DATA TYPE (VERY IMPORTANT)
         * =================================================
         *
         * String is NOT a primitive data type.
         * It is a CLASS in Java.
         *
         * Used to store text.
         */

        String name = "Himanshu";
        String greeting = "Hello";

        System.out.println("\nString Type:");
        System.out.println(name);
        System.out.println(greeting);

        /*
         * STRING OPERATIONS
         */

        // 1. Concatenation (joining strings)
        String fullGreeting = greeting + " " + name;
        System.out.println("\nString Concatenation:");
        System.out.println(fullGreeting);

        // 2. Length of string
        System.out.println("Length: " + name.length());

        // 3. Character at index
        System.out.println("Char at index 0: " + name.charAt(0));

        // 4. Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // 5. Compare strings
        String a = "Java";
        String c = "Java";

        System.out.println("\nString Comparison:");
        System.out.println(a.equals(c)); // TRUE

        /*
         * =================================================
         * STRING IMMUTABILITY (VERY IMPORTANT CONCEPT)
         * =================================================
         *
         * Once a String is created, it CANNOT be changed.
         */

        String lang = "Java";
        lang.concat(" Programming"); // this creates a NEW string

        System.out.println("\nString Immutability:");
        System.out.println(lang); // Still "Java"

        // Correct way
        lang = lang.concat(" Programming");
        System.out.println(lang); // "Java Programming"

        /*
         * Why Java made String immutable?
         * ✔ Security
         * ✔ Memory efficiency
         * ✔ Thread safety
         */

        /*
         * =================================================
         * 📌 FINAL INTERVIEW NOTES
         * =================================================
         *
         * ✔ Use int for most DSA problems
         * ✔ Use long for large numbers
         * ✔ Use double for decimals
         * ✔ Use char for single characters
         * ✔ String is immutable
         * ✔ Use equals() to compare strings
         *
         * After this, move to:
         * 👉 Operators
         * 👉 Conditions
         * 👉 Loops
         */

        System.out.println("\n--- END OF DATA TYPES ---");
    }
}
