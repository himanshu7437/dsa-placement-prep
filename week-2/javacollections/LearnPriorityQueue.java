import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * =========================================================
 * 📘 LearnPriorityQueue.java
 * =========================================================
 * Goal:
 * - Understand PriorityQueue in Java
 * - Learn how ordering works (Min Heap & Max Heap)
 * - Use this file for REVISION + INTERVIEWS
 *
 * PriorityQueue works on:
 * 👉 Heap Data Structure
 * =========================================================
 */

public class LearnPriorityQueue {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is a PriorityQueue? ⭐
         * ---------------------------------------------------------
         * PriorityQueue is a special type of Queue.
         *
         * Key idea:
         * - Elements are NOT processed in insertion order
         * - Elements are processed based on PRIORITY
         *
         * By default:
         * - Java PriorityQueue is a MIN HEAP
         * - Smallest element has highest priority
         */

        /*
         * ---------------------------------------------------------
         * 2️⃣ Creating a Max Heap 🔁
         * ---------------------------------------------------------
         * Comparator.reverseOrder():
         * - Reverses natural ordering
         * - Converts Min Heap → Max Heap
         */

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        /*
         * ---------------------------------------------------------
         * 3️⃣ Adding elements → offer() ➕
         * ---------------------------------------------------------
         * offer(element):
         * - Inserts element based on priority
         * - Heap reorders internally
         *
         * Time Complexity: O(log n)
         */

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println("PriorityQueue (Max Heap): " + pq);

        /*
         * ---------------------------------------------------------
         * 4️⃣ Viewing highest priority element → peek() 👀
         * ---------------------------------------------------------
         * peek():
         * - Returns element with highest priority
         * - Does NOT remove it
         *
         * Time Complexity: O(1)
         */

        System.out.println("Top priority element: " + pq.peek());

        /*
         * ---------------------------------------------------------
         * 5️⃣ Removing highest priority element → poll() ❌
         * ---------------------------------------------------------
         * poll():
         * - Removes and returns highest priority element
         * - Heap is restructured internally
         *
         * Time Complexity: O(log n)
         */

        pq.poll(); // removes highest element (40)
        System.out.println("After poll(): " + pq);

        /*
         * ---------------------------------------------------------
         * 6️⃣ Important Notes ⚠️
         * ---------------------------------------------------------
         * ❌ PriorityQueue does NOT allow null elements
         * ❌ Does NOT maintain sorted order while printing
         * ✔ Only guarantees that peek()/poll() give correct priority
         */

        /*
         * ---------------------------------------------------------
         * 7️⃣ Min Heap vs Max Heap 🧠
         * ---------------------------------------------------------
         * Min Heap (Default):
         *   Queue<Integer> pq = new PriorityQueue<>();
         *   -> Smallest element comes first
         *
         * Max Heap:
         *   Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
         *   -> Largest element comes first
         */

        /*
         * ---------------------------------------------------------
         * 8️⃣ When to Use PriorityQueue? 🎯
         * ---------------------------------------------------------
         * ✔ Scheduling tasks by priority
         * ✔ Dijkstra’s Algorithm
         * ✔ Huffman Coding
         * ✔ Top-K problems
         * ✔ CPU scheduling
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ PriorityQueue is heap-based
         * ✔ offer() / poll() → O(log n)
         * ✔ peek() → O(1)
         * ✔ Order is based on priority, not insertion
         *
         * Interview Tip 💡:
         * Printing a PriorityQueue does NOT show sorted order!
         */
    }
}
