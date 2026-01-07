
public class ProblemSet {
    
    public static void main(String[] args) {
        

    // ques - 1) Reverse String

    }

    //soln1 

    // ---- approach 1 -----
    public void reverseString1(char[] s) {
        int n = s.length;
        
        for(int i = 0; i < n/2 ; i++) {
            // swapping (two pointer approach)
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }

    // ---- approach 2 -----
    public void reverseString2(char[] s) {
        int left = 0, right = s.length - 1;

        while(left < right) {
            // swap
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // pointer increment and decrement 
            left++;
            right--;
        }
    }

}
