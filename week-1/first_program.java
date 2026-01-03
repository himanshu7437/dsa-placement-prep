public class first_program {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // the semicolon in java is a crucial element to indicate the end of a statement. it helps the compiler to understand the structure of your code by marking the boundaries between different statements.
    }
}

// main method is the entry point of a program.
// it has a specific signature:-
// i) public - access modifier indicating that the method can be accessed from outside the class.
// ii) static - indicates that the method belongs to the class rather than an instance of the class.
// iii) void - specifies that the method doesn't return any value.
// iv) main - the name of the method
// v) string[] args - the method accepts an array of strings as perimeters. this is where command-line arguments can be passed to your program.


//how java program runs!!
// 1) Source code is written in .java files.
// 2) compilation transform it into platform- independent bytecode(.class).
// 3) Execution is handled by JVM, which interprets or compiles the bytecode into native code for the specific operating system and hardware, allowing the program to run seamlessly across different environments.

// Test.java ----------compilation(javac) ---> Bytecode(Platform independent) -------------- Interpretation(JVM)---------> Machine code (Platform dependent)

// note - do not use code runner it will show error instead go for the following command
// i) compilation - javac datatypes/DataTypes.java
// ii) running - java datatypes.DataTypes