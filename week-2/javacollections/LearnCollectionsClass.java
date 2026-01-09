import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * =========================================================
 * 📘 LearnCollectionsClass.java
 * =========================================================
 * Goal:
 * - Understand java.util.Collections utility class
 * - Learn common methods used with List, Set & Map
 * - Prepare for interviews
 *
 * NOTE:
 * Collections works on COLLECTIONS (List, Set, Map)
 * Arrays works on ARRAYS
 * =========================================================
 */

public class LearnCollectionsClass {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is Collections Class? 🧰
         * ---------------------------------------------------------
         * Collections is a utility class in java.util package.
         *
         * It provides STATIC methods to:
         * ✔ Sort
         * ✔ Search
         * ✔ Reverse
         * ✔ Find min / max
         * ✔ Work with custom objects
         */

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(1);
        list.add(14);
        list.add(33);

        /*
         * ---------------------------------------------------------
         * 2️⃣ min(), max(), frequency() 🔍
         * ---------------------------------------------------------
         */

        // min → O(n)
        System.out.println("Minimum element: " + Collections.min(list));

        // max → O(n)
        System.out.println("Maximum element: " + Collections.max(list));

        // frequency → O(n)
        System.out.println("Frequency of 1: " + Collections.frequency(list, 1));

        /*
         * ---------------------------------------------------------
         * 3️⃣ Sorting a List (Natural Order) 🔃
         * ---------------------------------------------------------
         * sort(list)
         *
         * Time Complexity:
         * O(n log n)
         */

        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        /*
         * ---------------------------------------------------------
         * 4️⃣ Sorting in Reverse Order 🔁
         * ---------------------------------------------------------
         * sort(list, Comparator)
         */

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Reverse sorted list: " + list);

        /*
         * ---------------------------------------------------------
         * 5️⃣ Sorting Custom Objects 🧠
         * ---------------------------------------------------------
         *
         * Two ways:
         * ✔ Comparable (natural ordering)
         * ✔ Comparator (custom ordering)
         */

        /*
         * Example (Comparator):
         *
         * Collections.sort(studentList, new Comparator<Student>() {
         *     @Override
         *     public int compare(Student s1, Student s2) {
         *         return s1.name.compareTo(s2.name);
         *     }
         * });
         */

        /*
         * ---------------------------------------------------------
         * 6️⃣ Other Useful Methods 📌
         * ---------------------------------------------------------
         *
         * Collections.reverse(list)
         * Collections.shuffle(list)
         * Collections.binarySearch(list, key)
         * Collections.unmodifiableList(list)
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ Collections is a helper class
         * ✔ Used with List, Set, Map
         * ✔ Very common in interviews
         *
         * Interview Tip 💡:
         * Arrays → arrays
         * Collections → collections
         */
    }
}
