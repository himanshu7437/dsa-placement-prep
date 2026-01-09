import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * =========================================================
 * 📘 LearnMap.java
 * =========================================================
 * Goal:
 * - Understand Map in Java
 * - Learn HashMap vs TreeMap
 * - Practice iteration & common operations
 *
 * Map stores data as:
 * 👉 Key → Value pairs
 * =========================================================
 */

public class LearnMap {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is a Map? 🗺️
         * ---------------------------------------------------------
         * Map is NOT part of Collection interface.
         *
         * Key Features:
         * ✔ Stores data in key-value pairs
         * ✔ Keys are UNIQUE
         * ✔ Values can be duplicate
         * ✔ No index-based access
         */

        /*
         * ---------------------------------------------------------
         * 2️⃣ Map Implementations 🧠
         * ---------------------------------------------------------
         *
         * HashMap:
         * ✔ Fast
         * ❌ No order
         * ✔ Allows one null key
         *
         * TreeMap:
         * ✔ Sorted by keys
         * ❌ Slower than HashMap
         *
         * LinkedHashMap:
         * ✔ Maintains insertion order
         */

        // Uncomment to test different behavior 👇

        // Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();

        /*
         * ---------------------------------------------------------
         * 3️⃣ Adding elements ➕
         * ---------------------------------------------------------
         * put(key, value)
         *
         * HashMap → O(1)
         * TreeMap → O(log n)
         */

        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        /*
         * ---------------------------------------------------------
         * 4️⃣ Handling duplicate keys 🔁
         * ---------------------------------------------------------
         * If key already exists:
         * ✔ Old value is replaced
         */

        // numbers.put("Three", 32);

        /*
         * putIfAbsent()
         * ✔ Adds only if key is NOT present
         */

        numbers.putIfAbsent("Three", 33);
        System.out.println("Map values: " + numbers);

        /*
         * ---------------------------------------------------------
         * 5️⃣ Iterating over Map 🔄
         * ---------------------------------------------------------
         * entrySet() → Best way (Interview preferred)
         */

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println("Key: " + e.getKey());
            System.out.println("Value: " + e.getValue());
        }

        /*
         * Iterating only keys
         */

        for (String key : numbers.keySet()) {
            System.out.println("Key only: " + key);
        }

        /*
         * ---------------------------------------------------------
         * 6️⃣ Searching in Map 🔍
         * ---------------------------------------------------------
         */

        // containsKey() → O(1) HashMap | O(log n) TreeMap
        System.out.println(numbers.containsKey("one"));

        // containsValue() → O(n)
        System.out.println(numbers.containsValue(1));

        /*
         * ---------------------------------------------------------
         * 7️⃣ Important Map Methods 📌
         * ---------------------------------------------------------
         *
         * get(key)
         * remove(key)
         * size()
         * isEmpty()
         * clear()
         */

        /*
         * ---------------------------------------------------------
         * 8️⃣ When to Use Map? 🎯
         * ---------------------------------------------------------
         * ✔ Dictionary type data
         * ✔ Storing IDs & records
         * ✔ Counting frequency
         * ✔ Fast lookup using keys
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ Map = key-value storage
         * ✔ Keys are always UNIQUE
         * ✔ HashMap is fastest
         * ✔ TreeMap keeps data sorted
         *
         * Interview Tip 💡:
         * If order not required → HashMap
         * If sorted keys needed → TreeMap
         */
    }
}
