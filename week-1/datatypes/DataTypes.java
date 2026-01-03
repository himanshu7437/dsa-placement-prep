package datatypes;

/*
 * =========================================================
 *              JAVA DATA TYPES – EASY EXPLANATION
 * =========================================================
 *
 * Data types tell Java:
 * 1) What kind of data a variable can store
 * 2) How much memory is needed
 * 3) What operations are allowed on that data
 *
 * Think of data types as different sized boxes 📦
 * Small box → small data
 * Big box   → big data
 */

public class DataTypes {

    public static void main(String[] args) {

        /*
         * =================================================
         * 1️⃣ INTEGRAL (WHOLE NUMBER) DATA TYPES
         * =================================================
         * Used to store numbers WITHOUT decimal points
         */

        // byte → 1 byte (8 bits)
        // Range: -128 to 127
        byte byteValue = 10;

        // short → 2 bytes
        // Range: -32,768 to 32,767
        short shortValue = 1000;

        // int → 4 bytes (MOST COMMONLY USED)
        // Range: approx -2 billion to +2 billion
        int intValue = 100000;

        // long → 8 bytes (for very large numbers)
        // Must use 'L' at the end
        long longValue = 10000000000L;

        /*
         * Java automatically converts smaller data types
         * into bigger ones during calculations.
         * This is called TYPE PROMOTION.
         */

        System.out.println("Type Promotion Example:");
        System.out.println(shortValue + longValue); // short → long → result is long

        /*
         * =================================================
         * 2️⃣ DECIMAL (FLOATING POINT) DATA TYPES
         * =================================================
         * Used to store numbers WITH decimal points
         */

        // float → 4 bytes (less precise)
        // Must use 'f' at the end
        float floatValue = 3.14f;

        // double → 8 bytes (MORE precise, DEFAULT choice)
        double doubleValue = 3.1415926535;

        System.out.println("\nDecimal Values:");
        System.out.println("Float value  : " + floatValue);
        System.out.println("Double value : " + doubleValue);

        /*
         * =================================================
         * 3️⃣ BOOLEAN DATA TYPE
         * =================================================
         * Used to store true / false values
         * Size: 1 bit
         */

        boolean isJavaEasy = true;
        boolean isFishFlying = false;

        System.out.println("\nBoolean Values:");
        System.out.println("Is Java Easy? " + isJavaEasy);
        System.out.println("Can fish fly? " + isFishFlying);

        /*
         * =================================================
         * 4️⃣ CHARACTER DATA TYPE
         * =================================================
         * Used to store a SINGLE character
         * Size: 2 bytes (because Java uses Unicode)
         */

        char grade = 'A';
        char symbol = '@';

        System.out.println("\nCharacter Values:");
        System.out.println("Grade  : " + grade);
        System.out.println("Symbol : " + symbol);

        /*
         * =================================================
         * 📌 IMPORTANT INTERVIEW NOTES
         * =================================================
         *
         * ✔ int is preferred for most DSA problems
         * ✔ long is used when numbers are very large
         * ✔ double is preferred over float
         * ✔ char uses single quotes (' ')
         * ✔ boolean only stores true or false
         */

        System.out.println("\n--- Program End ---");
    }
}

/*
 * =========================================================
 * QUICK SUMMARY
 * =========================================================
 *
 * Integral Numbers:
 * byte  → 1 byte
 * short → 2 bytes
 * int   → 4 bytes
 * long  → 8 bytes
 *
 * Decimal Numbers:
 * float  → 4 bytes
 * double → 8 bytes
 *
 * Boolean:
 * boolean → 1 bit (true / false)
 *
 * Characters:
 * char → 2 bytes (Unicode support)
 *
 * =========================================================
 */
