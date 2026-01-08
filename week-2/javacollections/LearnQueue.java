import java.util.LinkedList;
import java.util.Queue;

/*
 * =========================================================
 * 📘 LearnQueue.java
 *
 * Queue follows:
 * 👉 FIFO (First In First Out)
 * =========================================================
 */

public class LearnQueue {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is a Queue? 🚶‍♂️🚶‍♀️🚶
         * ---------------------------------------------------------
         * Queue is a linear data structure.
         * It works on the principle of:
         *   👉 FIFO (First In First Out)
         *
         * Real-life examples:
         * - Line at a ticket counter
         * - Printer queue
         * - Task scheduling
         *
         * In Java:
         * - Queue is an interface
         * - Common implementation: LinkedList
         */

        Queue<Integer> queue = new LinkedList<>();

        /*
         * ---------------------------------------------------------
         * 2️⃣ Adding elements → offer() ➕
         * ---------------------------------------------------------
         * offer(element):
         * - Adds element to the rear (end) of queue
         * - Returns true if successful
         *
         * Time Complexity: O(1)
         */

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue elements: " + queue);

        /*
         * ---------------------------------------------------------
         * 3️⃣ Viewing front element → peek() 👀
         * ---------------------------------------------------------
         * peek():
         * - Returns front element
         * - Does NOT remove it
         * - Returns null if queue is empty
         *
         * Time Complexity: O(1)
         */

        System.out.println("Front element (peek): " + queue.peek());

        /*
         * ---------------------------------------------------------
         * 4️⃣ Removing elements → poll() ❌
         * ---------------------------------------------------------
         * poll():
         * - Removes and returns front element
         * - Returns null if queue is empty
         *
         * Time Complexity: O(1)
         */

        queue.poll(); // removes 1
        System.out.println("After poll(): " + queue);

        /*
         * ---------------------------------------------------------
         * 5️⃣ Other Useful Queue Methods 🛠️
         * ---------------------------------------------------------
         */

        // isEmpty()
        // Time Complexity: O(1)
        System.out.println("Is queue empty? " + queue.isEmpty());

        // size()
        // Time Complexity: O(1)
        System.out.println("Queue size: " + queue.size());

        /*
         * ---------------------------------------------------------
         * 6️⃣ offer() vs add() ⚠️
         * ---------------------------------------------------------
         * offer():
         * - Returns false if insertion fails
         * - Preferred for Queue
         *
         * add():
         * - Throws exception if insertion fails
         */

        /*
         * ---------------------------------------------------------
         * 7️⃣ When to Use Queue? 🎯
         * ---------------------------------------------------------
         * ✔ Task scheduling
         * ✔ Producer–Consumer problems
         * ✔ BFS (Breadth First Search)
         * ✔ Resource sharing
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ Queue follows FIFO
         * ✔ offer(), poll(), peek() → O(1)
         * ✔ LinkedList is a common implementation
         *
         * Interview Tip 💡:
         * Prefer Queue (interface) over LinkedList (class)
         */
    }
}
