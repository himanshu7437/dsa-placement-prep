
import java.util.Scanner;


public class Problems {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ques - 1) positive or negative
        // System.out.println("\nEnter your number : ");
        // int num1 = sc.nextInt();
        // checkIfPositive(num1);

        // ques - 2) even or odd
        // System.out.println("\n Enter your number : ");
        // int num2 = sc.nextInt();
        // checkEvenOrOdd(num2);

        // ques - 3) compare two numbers
        // System.out.println("\nEnter first number " );
        // int num3 = sc.nextInt();

        // System.out.println("\nEnter second number : ");
        // int num4 = sc.nextInt();
        // chechWhoIsGreater(num3, num4);

        // loop questions --------------

        // ques - 1) print 1 to N
        // System.out.println("\nEnter your Number");
        // int ourN = sc.nextInt();
        // printOneToN(ourN);

        // ques - 2) sum of N numbers
        // System.out.println("\nEnter your number");
        // int num5 = sc.nextInt();
        // sumOfN(num5);

        // ques - 3) factorial of a number
        // System.out.println("\nEnter your number");
        // int num6 = sc.nextInt();
        // facto(num6);20

        // ques - 4) reverse a number using while loop
        // System.out.println("\nEnter your number");
        // int num7 = sc.nextInt();
        // reverseNum(num7);

        // ques - 5) count digits using a do while
        // System.out.println("\nEnter your number");
        // int num8 = sc.nextInt();
        // countDigit(num8);

        // closing scanner
        sc.close();
    }

    // soln1
    public static void checkIfPositive(int num) {
        if(num < 0) {
            System.out.println("number is negative.");
        } else if (num == 0){
            System.out.println("number is zero.");
        } else {
            System.out.println("number is positive.");
        }
    }

    //soln2
    public static void checkEvenOrOdd(int num) {
        if(num%2==0) {
            System.out.println("number is even.");
        } else {
            System.out.println("number is odd.");
        }
    }   

    //soln3
    public static void chechWhoIsGreater(int first, int second) {
        if(first < second) {
            System.out.println("second is greater.");
        } else if (first == second){
            System.out.println("both are equal.");
        } else {
            System.out.println("first is greater");
        }
    }

    // -------loops

    //soln1
    public static void printOneToN(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input, Enter greater than 0.");
            return;
        }
        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    //soln2
    public static void sumOfN(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input, Enter greater than 0.");
            return;
        }

        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println("Sum is " + sum);
    }

    //soln3
    public static void facto(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input, Enter greater than 0.");
            return;
        }

        long result = 1;

        for(int i = num; i >= 1; i--) {
            result*=i;
        }
        System.out.println("factorial is " + result);
    }

    //soln4
    public static void reverseNum(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input, Enter greater than 0.");
            return;
        }
        if(num <= 9) {
            System.out.println(num);
            return;
        }

        int result = 0;

        while(num != 0) {
            int rem = num%10;
            result = result * 10 + rem;
            num = num/10;
        }
        System.out.println("reverse number is "+ result);
    }

    //soln5
    public static void countDigit(int num) {
        if(num == 0) {
            System.out.println("Invalid Input, Enter greater than or less than 0.");
            return;
        }

        int result = 0;

        do{
            num = num/10;
            result++;
        } while(num != 0);

        System.out.println("total digits are "+ result);
    }


}