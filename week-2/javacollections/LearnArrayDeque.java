import java.util.ArrayDeque;

/*
 * =========================================================
 * 📘 LearnArrayDeque.java
 * =========================================================
 * Goal:
 * - Understand ArrayDeque in Java
 * - Learn how it works as Queue & Stack
 * - Use this file for REVISION + INTERVIEW prep
 *
 * ArrayDeque implements:
 * 👉 Deque (Double Ended Queue)
 * =========================================================
 */

public class LearnArrayDeque {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is ArrayDeque? 🔄
         * ---------------------------------------------------------
         * ArrayDeque is a resizable array implementation of Deque.
         *
         * Key Features:
         * ✔ Allows insertion & removal from BOTH ends
         * ✔ Faster than Stack and LinkedList
         * ✔ No capacity restriction
         * ❌ Does NOT allow null elements
         */

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        /*
         * ---------------------------------------------------------
         * 2️⃣ Adding elements ➕
         * ---------------------------------------------------------
         * offer()        → adds at rear
         * offerFirst()   → adds at front
         * offerLast()    → adds at rear
         *
         * Time Complexity: O(1)
         */

        adq.offer(23);          // rear
        adq.offerFirst(12);     // front
        adq.offerLast(45);      // rear
        adq.offer(22);          // rear

        System.out.println("ArrayDeque elements: " + adq);

        /*
         * ---------------------------------------------------------
         * 3️⃣ Viewing elements 👀
         * ---------------------------------------------------------
         * peek()        → front element
         * peekFirst()   → front element
         * peekLast()    → last element
         *
         * Time Complexity: O(1)
         */

        System.out.println("peek(): " + adq.peek());
        System.out.println("peekFirst(): " + adq.peekFirst());
        System.out.println("peekLast(): " + adq.peekLast());

        /*
         * ---------------------------------------------------------
         * 4️⃣ Removing elements ❌
         * ---------------------------------------------------------
         * poll()        → removes from front
         * pollFirst()   → removes from front
         * pollLast()    → removes from rear
         *
         * Time Complexity: O(1)
         */

        System.out.println("poll(): " + adq.poll());
        System.out.println("After poll(): " + adq);

        System.out.println("pollFirst(): " + adq.pollFirst());
        System.out.println("After pollFirst(): " + adq);

        System.out.println("pollLast(): " + adq.pollLast());
        System.out.println("After pollLast(): " + adq);

        /*
         * ---------------------------------------------------------
         * 5️⃣ Using ArrayDeque as Stack 📚
         * ---------------------------------------------------------
         * push() → add at front
         * pop()  → remove from front
         *
         * Recommended replacement for Stack class
         */

        /*
         * ---------------------------------------------------------
         * 6️⃣ When to Use ArrayDeque? 🎯
         * ---------------------------------------------------------
         * ✔ Implement Stack or Queue
         * ✔ Sliding Window problems
         * ✔ BFS / DFS
         * ✔ High performance required
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ ArrayDeque is fast and flexible
         * ✔ Supports both ends efficiently
         * ✔ All major operations → O(1)
         *
         * Interview Tip 💡:
         * Always prefer ArrayDeque over Stack and LinkedList
         */
    }
}
