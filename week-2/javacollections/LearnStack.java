import java.util.Stack;

/*
 * =========================================================
 * 📘 LearnStack.java
 * =========================================================
 * Stack follows:
 * 👉 LIFO (Last In First Out)
 * =========================================================
 */

public class LearnStack {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is a Stack? 📚
         * ---------------------------------------------------------
         * Stack is a linear data structure.
         * It works on the principle of:
         *   👉 LIFO (Last In First Out)
         *
         * Real-life examples:
         * - Stack of books
         * - Browser back button
         * - Undo/Redo operations
         *
         * In Java:
         * - Stack is a class
         * - Present in java.util package
         * - Stack extends Vector (legacy class)
         */

        Stack<String> animals = new Stack<>();

        /*
         * ---------------------------------------------------------
         * 2️⃣ push() → Adding elements 🧱
         * ---------------------------------------------------------
         * push(element):
         * - Adds element to the TOP of stack
         *
         * Time Complexity: O(1)
         */

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack elements: " + animals);

        /*
         * ---------------------------------------------------------
         * 3️⃣ peek() → View top element 👀
         * ---------------------------------------------------------
         * peek():
         * - Returns the top element
         * - Does NOT remove the element
         *
         * Time Complexity: O(1)
         */

        System.out.println("Top element (peek): " + animals.peek());

        /*
         * ---------------------------------------------------------
         * 4️⃣ pop() → Remove top element ❌
         * ---------------------------------------------------------
         * pop():
         * - Removes and returns top element
         *
         * Time Complexity: O(1)
         */

        animals.pop(); // removes "Cat"
        System.out.println("After pop, top element: " + animals.peek());

        /*
         * ---------------------------------------------------------
         * 5️⃣ Other Useful Stack Methods 🛠️
         * ---------------------------------------------------------
         */

        // empty() → checks if stack is empty
        // Time Complexity: O(1)
        System.out.println("Is stack empty? " + animals.empty());

        // search(element)
        // Returns 1-based position from top
        // Returns -1 if element not found
        // Time Complexity: O(n)
        System.out.println("Position of Dog: " + animals.search("Dog"));

        /*
         * ---------------------------------------------------------
         * 6️⃣ When to Use Stack? 🎯
         * ---------------------------------------------------------
         * ✔ Function calls (Call Stack)
         * ✔ Expression evaluation
         * ✔ Undo / Redo operations
         * ✔ Backtracking problems
         *
         * ❌ Not recommended for new applications
         *    (Deque is preferred over Stack)
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ Stack follows LIFO
         * ✔ push(), pop(), peek() are O(1)
         * ✔ Simple and easy to use
         *
         * Interview Tip 💡:
         * Stack is often implemented using:
         * - Array
         * - LinkedList
         * - Deque (recommended)
         */
    }
}
