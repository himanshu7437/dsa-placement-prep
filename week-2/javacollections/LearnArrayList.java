import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * =========================================================
 * 📘 LearnArrayList.java
 * =========================================================
 */

public class LearnArrayList {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is ArrayList? 📦
         * ---------------------------------------------------------
         * - ArrayList is a resizable (dynamic) array.
         * - Present in java.util package.
         * - Implements List interface.
         *
         * Key Features:
         * ✔ Maintains insertion order
         * ✔ Allows duplicate elements
         * ✔ Allows random access
         * ❌ Not synchronized (not thread-safe by default)
         */

        ArrayList<String> studentNames = new ArrayList<>();

        // add(element)
        // Time Complexity: O(1) [Amortized]
        studentNames.add("Rakesh");
        studentNames.add("Amit");
        studentNames.add("Neha");

        System.out.println("Student Names: " + studentNames);

        /*
         * ---------------------------------------------------------
         * 2️⃣ Using List Interface (Best Practice) 🧠
         * ---------------------------------------------------------
         * Always prefer:
         *   List<Type> ref = new ArrayList<>();
         *
         * Reason:
         * - Loose coupling
         * - Easy to switch implementation later
         */

        List<Integer> list = new ArrayList<>();

        // Adding elements
        // Time Complexity: O(1)
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Initial List: " + list);

        /*
         * ---------------------------------------------------------
         * 3️⃣ Adding Elements ➕
         * ---------------------------------------------------------
         */

        // Add at end
        // Time Complexity: O(1)
        list.add(4);
        System.out.println("After adding 4: " + list);

        // Add at specific index
        // Time Complexity: O(n) (elements shift)
        list.add(1, 50);
        System.out.println("After adding 50 at index 1: " + list);

        /*
         * ---------------------------------------------------------
         * 4️⃣ Adding One List into Another 🔗
         * ---------------------------------------------------------
         */

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(151);

        // addAll()
        // Time Complexity: O(m) where m = size of newList
        list.addAll(newList);
        System.out.println("After addAll(): " + list);

        /*
         * ---------------------------------------------------------
         * 5️⃣ Accessing Elements 👀
         * ---------------------------------------------------------
         */

        // get(index)
        // Time Complexity: O(1)
        System.out.println("Element at index 1: " + list.get(1));

        /*
         * ---------------------------------------------------------
         * 6️⃣ Removing Elements ❌
         * ---------------------------------------------------------
         */

        // Remove by index
        // Time Complexity: O(n)
        list.remove(1);
        System.out.println("After removing index 1: " + list);

        // Remove by value
        // Time Complexity: O(n)
        list.remove(Integer.valueOf(150));
        System.out.println("After removing value 150: " + list);

        /*
         * ---------------------------------------------------------
         * 7️⃣ Updating Elements ✏️
         * ---------------------------------------------------------
         */

        // set(index, value)
        // Time Complexity: O(1)
        list.set(2, 1000);
        System.out.println("After updating index 2: " + list);

        /*
         * ---------------------------------------------------------
         * 8️⃣ Searching in ArrayList 🔍
         * ---------------------------------------------------------
         */

        // contains()
        // Time Complexity: O(n)
        System.out.println("Contains 4? " + list.contains(4));
        System.out.println("Contains 500? " + list.contains(500));

        /*
         * ---------------------------------------------------------
         * 9️⃣ Size of ArrayList 📏
         * ---------------------------------------------------------
         */

        // size()
        // Time Complexity: O(1)
        System.out.println("Size of list: " + list.size());

        /*
         * ---------------------------------------------------------
         * 🔟 Traversing an ArrayList 🔁
         * ---------------------------------------------------------
         */

        // i) Using for loop
        // Best when index is required
        System.out.println("\nTraversal using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + " → " + list.get(i));
        }

        // ii) Using for-each loop
        // Clean and readable 🙂
        System.out.println("\nTraversal using for-each loop:");
        for (Integer element : list) {
            System.out.println("Element → " + element);
        }

        // iii) Using Iterator
        // Used when modification during traversal is needed
        System.out.println("\nTraversal using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator element → " + iterator.next());
        }

        /*
         * ---------------------------------------------------------
         * 1️⃣1️⃣ Clearing the ArrayList 🧹
         * ---------------------------------------------------------
         */

        // clear()
        // Time Complexity: O(n)
        // list.clear();
        // System.out.println("After clear(): " + list);

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ ArrayList is best for fast access
         * ✔ Allows duplicates & maintains order
         * ❌ Not good for frequent middle insert/delete
         *
         * Interview Tip 💡:
         * If access is frequent → ArrayList
         * If insertion/deletion is frequent → LinkedList
         */
    }
}
