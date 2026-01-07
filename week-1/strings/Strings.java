
/**
 * COMPLETE STRING GUIDE IN JAVA
 * ------------------------------
 * This file covers:
 * 1. What is String
 * 2. How Strings are stored (String Pool)
 * 3. Ways to create Strings
 * 4. String immutability
 * 5. Common String methods (MOST IMPORTANT)
 * 6. String comparison (== vs equals)
 * 7. Empty vs null
 * 8. StringBuilder vs String
 * 9. Interview tips & common mistakes
 */

public class Strings {

    public static void main(String[] args) {

        // ===============================
        // 1️⃣ WHAT IS A STRING?
        // ===============================

        // String is a sequence of characters
        String s1 = "Hello";

        // String is a class in java.lang package
        // So it has many built-in methods

        // ===============================
        // 2️⃣ WAYS TO CREATE STRING
        // ===============================

        // 2.1 String literal (stored in String Pool)
        String a = "Java";
        String b = "Java";

        // Both point to SAME memory (String Pool)
        System.out.println(a == b);        // true
        System.out.println(a.equals(b));   // true

        // 2.2 Using new keyword (stored in Heap)
        String c = new String("Java");
        String d = new String("Java");

        // Different memory locations
        System.out.println(c == d);        // false
        System.out.println(c.equals(d));   // true

        // ===============================
        // 3️⃣ STRING IMMUTABILITY
        // ===============================

        String str = "Hello";
        str.concat(" World");

        // Original string NOT changed
        System.out.println(str); // Hello

        // Correct way
        str = str.concat(" World");
        System.out.println(str); // Hello World

        // ===============================
        // 4️⃣ STRING LENGTH
        // ===============================

        String name = "Himanshu";
        System.out.println(name.length()); // 8

        // ===============================
        // 5️⃣ CHARACTER ACCESS
        // ===============================

        char firstChar = name.charAt(0);
        System.out.println(firstChar); // H

        // ===============================
        // 6️⃣ EMPTY vs NULL (VERY IMPORTANT)
        // ===============================

        String empty = "";
        String nullStr = null;

        System.out.println(empty.isEmpty()); // true
        // nullStr.isEmpty(); ❌ NullPointerException

        // Correct check
        if (nullStr == null || nullStr.isEmpty()) {
            System.out.println("String is null or empty");
        }

        // ===============================
        // 7️⃣ STRING COMPARISON
        // ===============================

        String x = "hello";
        String y = "hello";
        String z = new String("hello");

        System.out.println(x == y);        // true (same pool)
        System.out.println(x == z);        // false (heap vs pool)

        System.out.println(x.equals(y));   // true
        System.out.println(x.equals(z));   // true

        // RULE:
        // ==  -> memory comparison
        // equals() -> content comparison

        // ===============================
        // 8️⃣ CASE CONVERSION
        // ===============================

        String word = "Java";
        System.out.println(word.toUpperCase()); // JAVA
        System.out.println(word.toLowerCase()); // java

        // ===============================
        // 9️⃣ CHECK SUBSTRING
        // ===============================

        String sentence = "I love Java programming";

        System.out.println(sentence.contains("Java")); // true
        System.out.println(sentence.startsWith("I"));  // true
        System.out.println(sentence.endsWith("ing"));  // true

        // ===============================
        // 🔟 STRING REPLACEMENT
        // ===============================

        String s = "banana";
        System.out.println(s.replace('a', 'o')); // bonono

        // ===============================
        // 1️⃣1️⃣ TRIM (remove spaces)
        // ===============================

        String spaced = "   hello   ";
        System.out.println(spaced.trim()); // "hello"

        // ===============================
        // 1️⃣2️⃣ SPLIT STRING
        // ===============================

        String data = "Java,Python,C++";
        String[] langs = data.split(",");

        for (String lang : langs) {
            System.out.println(lang);
        }

        // ===============================
        // 1️⃣3️⃣ STRING TO CHAR ARRAY
        // ===============================

        String alpha = "abc";
        char[] arr = alpha.toCharArray();

        for (char ch : arr) {
            System.out.println(ch);
        }

        // ===============================
        // 1️⃣4️⃣ VALUEOF (Convert to String)
        // ===============================

        int num = 10;
        String numStr = String.valueOf(num);
        System.out.println(numStr + 5); // "105"

        // ===============================
        // 1️⃣5️⃣ STRINGBUILDER (MUTABLE STRING)
        // ===============================

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.append("!");

        System.out.println(sb); // Hello World!

        // Use StringBuilder when:
        // - Multiple modifications
        // - Loops
        // - Performance matters

        // ===============================
        // 1️⃣6️⃣ STRING vs STRINGBUILDER
        // ===============================

        /*
         * String:
         * - Immutable
         * - Thread-safe
         * - Slower for modifications
         *
         * StringBuilder:
         * - Mutable
         * - Not thread-safe
         * - Faster
         */

        // ===============================
        // 1️⃣7️⃣ COMMON STRING INTERVIEW MISTAKES
        // ===============================

        // ❌ if (str == "")
        // ✅ if (str.isEmpty())

        // ❌ if (str == "Java")
        // ✅ if (str.equals("Java"))

        // ❌ Calling methods without null check
        // ✅ Always check null first

        // ===============================
        // 1️⃣8️⃣ BEST PRACTICES
        // ===============================

        // ✔ Prefer equals() for comparison
        // ✔ Check null before using String methods
        // ✔ Use StringBuilder in loops
        // ✔ Avoid unnecessary new String()
    }
}
