import java.util.Set;
import java.util.TreeSet;

/*
 * =========================================================
 * 📘 LearnSet.java
 * =========================================================
 * Goal:
 * - Understand Set in Java
 * - Learn different Set implementations
 * - Use this file for REVISION + INTERVIEW prep
 *
 * Set represents:
 * 👉 A collection of UNIQUE elements
 * =========================================================
 */

public class LearnSet {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is a Set? 🔐
         * ---------------------------------------------------------
         * Set is an interface in java.util package.
         *
         * Key Features:
         * ✔ Does NOT allow duplicate elements
         * ✔ No index-based access
         * ✔ Order depends on implementation
         */

        /*
         * ---------------------------------------------------------
         * 2️⃣ Set Implementations 🧠
         * ---------------------------------------------------------
         *
         * HashSet:
         * ✔ Fast performance
         * ❌ No order
         *
         * LinkedHashSet:
         * ✔ Maintains insertion order
         * ✔ Slightly slower than HashSet
         *
         * TreeSet:
         * ✔ Stores elements in SORTED order
         * ❌ Slower than HashSet
         */

        // Uncomment one at a time to observe behavior 👇

        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        /*
         * ---------------------------------------------------------
         * 3️⃣ Adding elements ➕
         * ---------------------------------------------------------
         * add(element)
         *
         * HashSet / LinkedHashSet → O(1)
         * TreeSet               → O(log n)
         */

        set.add(1);
        set.add(14);
        set.add(2);
        set.add(55);
        set.add(6);
        set.add(2);   // duplicate → ignored

        System.out.println("Set elements: " + set);

        /*
         * ---------------------------------------------------------
         * 4️⃣ Removing elements ❌
         * ---------------------------------------------------------
         * remove(element)
         *
         * HashSet / LinkedHashSet → O(1)
         * TreeSet               → O(log n)
         */

        set.remove(55);
        System.out.println("After removing 55: " + set);

        /*
         * ---------------------------------------------------------
         * 5️⃣ Searching in Set 🔍
         * ---------------------------------------------------------
         * contains(element)
         *
         * HashSet / LinkedHashSet → O(1)
         * TreeSet               → O(log n)
         */

        System.out.println("Contains 67? " + set.contains(67));

        /*
         * ---------------------------------------------------------
         * 6️⃣ Checking Set state 📦
         * ---------------------------------------------------------
         */

        // isEmpty() → O(1)
        System.out.println("Is set empty? " + set.isEmpty());

        // size() → O(1)
        System.out.println("Size of set: " + set.size());

        /*
         * ---------------------------------------------------------
         * 7️⃣ Clearing the Set 🧹
         * ---------------------------------------------------------
         * clear()
         *
         * Time Complexity: O(n)
         */

        set.clear();
        System.out.println("After clear(): " + set);

        /*
         * ---------------------------------------------------------
         * 8️⃣ When to Use Set? 🎯
         * ---------------------------------------------------------
         * ✔ Remove duplicates
         * ✔ Store unique IDs
         * ✔ Fast membership checking
         * ✔ Sorted unique data (TreeSet)
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ Set stores UNIQUE elements
         * ✔ TreeSet keeps data sorted
         * ✔ HashSet is fastest
         *
         * Interview Tip 💡:
         * If order is not required → HashSet
         * If order is required     → LinkedHashSet
         * If sorted data required  → TreeSet
         */
    }
}
