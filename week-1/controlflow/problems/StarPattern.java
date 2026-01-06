
import java.util.Scanner;



public class StarPattern {
    
    public static void main(String[] args) {

        // taking input 
        Scanner sc = new Scanner(System.in);

        // pattern questions -----

        // 1) solid rectangle

        // ***** 
        // ***** 
        // ***** 

        // System.out.println("\nEnter your number - ");
        // int num1 = sc.nextInt();
        // solidRectangle(num1);

        // 2) hollow rectangle

        // ***** 
        // *   * 
        // *****     
        
        // System.out.println("\nEnter your number - ");
        // int num2 = sc.nextInt();
        // hollowRectangle(num2);

        // 3) half pyramid

        // * 
        // ** 
        // *** 
        // **** 

        // System.out.println("\nEnter your number - ");
        // int num3 = sc.nextInt();
        // halfPyramid(num3);

        // 4) inverted half pyramid

        // **** 
        // *** 
        // ** 
        // * 

        // System.out.println("\nEnter your number - ");
        // int num4 = sc.nextInt();
        // invertedPyramid(num4);

        // 5) numbers pyramid

        // 1 
        // 12 
        // 123 
        // 1234 

        System.out.println("\nEnter your number - ");
        int num5 = sc.nextInt();
        numberPyramid(num5);

        // closing scanner
        sc.close();
    }

    // soln 1
    public static void solidRectangle(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input. Enter digit greater than 0.");
            return;
        }

        for(int i = 1; i <= num; i++) {
            String star = "";
            for(int j = 1; j <= num; j++) {
                star+="*";
            }
            System.out.println(star);
        }
    }

    //soln 2
    public static void hollowRectangle(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input. Enter digit greater than 0.");
            return;
        }

        for(int i = 1; i <= num; i++) {
            String star = "";
            for(int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    star+="*";
                } else {
                    star+=" ";
                }
            }
            System.out.println(star);
        }
    }

    //soln3
    public static void halfPyramid(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input. Enter digit greater than 0.");
            return;
        }

        for(int i = 1; i <= num; i++) {
            String star = "";
            for(int j = 1; j <= num; j++) {
                if(j <= i) {
                    star += "*";
                }
            }
            System.out.println(star);
        }
    }

    // soln4
    public static void invertedPyramid(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input, Enter greater than 0.");
            return;
        }

        for(int i = 1; i <= num; i++) {
            String star = "";
            for(int j = num; j >= 1; j--) {
                if(i == j || i < j) {
                    star += "*";
                }
            }
            System.out.println(star);
        }
    }

    // soln5
    public static void numberPyramid(int num) {
        if(num <= 0) {
            System.out.println("Invalid Input, Enter greater than 0.");
            return;
        }

        for(int i = 1; i <= num; i++) {
            String numbers = "";
            for(int j = 1; j <= i; j++) {
                numbers+=j;
            }
            System.out.println(numbers);
        }
    }
}
