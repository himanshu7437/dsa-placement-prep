
import java.util.Scanner;


public class Problems {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ques - 1) check empty strings
        System.out.print("\nEnter the String - ");
        String firstStr = sc.nextLine();
        checkEmpty(firstStr);

        System.out.println("\nOther Examples :-");
        checkEmpty("hello");
        checkEmpty("");
        checkEmpty(null);

        // ques - 2) check first character
        System.out.print("\nEnter the String - ");
        String secondStr = sc.nextLine();
        checkFirstChar(secondStr);

        System.out.println("\nOther Examples :-");
        checkFirstChar("himanshu");
        checkFirstChar("apple");
        checkFirstChar("");
        checkFirstChar(null);
        
        // ques - 3) string length check
        System.out.print("\nEnter the String - ");
        String thirdStr = sc.nextLine();
        checkLength(thirdStr);

        System.out.println("\nOther Examples :-");
        checkLength("hello");
        checkLength("Ohayo");
        checkLength("Konichiwa");
        checkLength(null);
    }

    public static void checkEmpty(String str) {
        if(str == null || str.isEmpty()) {
            System.out.println("The String is empty");
        } else {
            System.out.println("The String is not empty.");
        }
    }

    public static void checkFirstChar(String str) {
        if(str == null || str.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        String vowels = "aeiou";
        char ch = Character.toLowerCase(str.charAt(0));

        if(vowels.contains(String.valueOf(ch))) {
            System.out.println("vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }

    public static void checkLength(String str) {
        if(str == null) {
            System.out.println("Invalid input");
            return;
        }

        if(str.length() < 5) {
            System.out.println("Length is less than 5.");
        } else if (str.length() == 5) {
            System.out.println("Length  is equal to 5.");
        } else {
            System.out.println("Length is greater than 5");
        }
    }

}